//Example of default constructor that displays the default values
public class ConstructorBook1 {
	int id;
	String name;
	void display() {System.out.println(id + " " + name);}
	

	public static void main(String[] args) {
		
		ConstructorBook1 b1=new ConstructorBook1();
		ConstructorBook1 b2= new ConstructorBook1();
		b1.display();
		b2.display();

	}

}
