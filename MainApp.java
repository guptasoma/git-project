
public class MainApp{

		String message="Jenkins email notification" ;

		public static void main(String[] args){
			MainApp map=new MainApp();
			
			System.out.println("This is Java Jenkins Demo");
		
			//Applied toUpperCase() method to the String value
			System.out.println("Message : "+map.message.toUpperCase());
			
			//creating a Product instance
			Product product=new Product("Samsung M32",13999.00);
			System.out.println(product);
		}

}