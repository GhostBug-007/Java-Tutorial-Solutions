interface VideoPlayer{
	void play(String fileName);
}

class Mp4Player implements VideoPlayer{
	@Override
	public void play(String fileName){
		System.out.println("play mp4 file "+fileName);
	}
}

class AVIPlayer implements VideoPlayer{
	@Override
	public void play(String fileName){
		System.out.println("play in AVI "+ fileName) ;
	}
}

class PlayerFactory{
	public VideoPlayer getVideoPlayer(String fileName){
		if(fileName.endsWith(".mp4"))
			return new Mp4Player() ;
		else if (fileName.endsWith(".avi")) 
			return new AVIPlayer() ;
		else
			return null ;
	}
}

public class Interface_coupling {
	public static void main(String [] args){
		String fileName = "Sample.avi" ;
		PlayerFactory pf = new PlayerFactory() ;
		VideoPlayer player = pf.getVideoPlayer(fileName) ;
		if (player != null)
			player.play(fileName) ;

	}
}