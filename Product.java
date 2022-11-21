public class Product{

	String name;
	Double price;
	
	public String toString(){
		return "Product '"+name+ "' costs Rs. "+price;
	}
	
	public Product(String name,Double price){
		this.name=name;
		this.price=price;	
	}
	
}