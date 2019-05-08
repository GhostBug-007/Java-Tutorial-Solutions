interface AudioPlayer{
	void play() ;
}

interface AudioRecorder{
	void record() ;
}

interface AudioSystem extends AudioPlayer, AudioRecorder {

}

interface FMPlayer{
	void playFM() ;
}

abstract class BaseMusicSystem implements AudioSystem, FMPlayer {
	@Override
	public void play() {
		System.out.println("play Audio");
	}

	@Override 
	public void record(){
		System.out.println("record Audio");
	}
}

class MyMusicSystem extends BaseMusicSystem{
	@Override
	public void playFM(){
		System.out.println("play FM");
	}
	public void switchOff(){
		System.out.println("Switched OFF");
	}
}

public class Multiple_interface{
	public static void main(String [] args){

		MyMusicSystem m1 = new MyMusicSystem() ; 
		m1.record() ;
		m1.play() ;
		m1.playFM() ;
		m1.switchOff() ;

		AudioPlayer a1 ; 
		a1 = m1 ;
		a1.play() ;
		// a1.record();

		AudioRecorder aR = m1 ;
		aR.record() ;

		FMPlayer fm = m1 ;
		fm.playFM() ; 

		AudioSystem as = m1 ;
		as.play() ;
		as.record() ;
	}
}