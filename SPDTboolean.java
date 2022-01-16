
public class SPDTboolean {

	public static void main(String[] args) {
		String strObject = "false";
		 
		boolean b = Boolean.parseBoolean(strObject);
		System.out.println("String to boolean: " + b);
		System.out.println( Boolean.parseBoolean("TRUE") ); //true
		System.out.println( Boolean.parseBoolean("True") ); //true
		System.out.println( Boolean.parseBoolean("true") ); //true
		System.out.println( Boolean.parseBoolean("123") ); //false
		System.out.println( Boolean.parseBoolean(null) ); //false
		System.out.println( Boolean.parseBoolean("") ); //false
		System.out.println( Boolean.parseBoolean("432.123") ); //false
	}

}
