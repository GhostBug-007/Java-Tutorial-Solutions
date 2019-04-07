import java.util.LinkedList ; 

class ShoppingCart{
	public LinkedList<String> products = new LinkedList<>() ;

	public void addToCart(String product){
		products.add(product) ;
	}
	public void order() {
		System.out.println("Ordered Products") ;
		System.out.println(products);
		System.out.println(products.get(0)) ;
	}
}

public class Shopping{
	public static void main(String [] args) {
		ShoppingCart cart = new ShoppingCart() ;
		cart.addToCart("Mouse") ;
		cart.addToCart("Pendrive") ;
		cart.addToCart("Keyboard") ;
		System.out.println(cart.products.get(0)) ;
		cart.order() ;
	}
}