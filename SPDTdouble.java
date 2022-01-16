
public class SPDTdouble {

	public static void main(String[] args) {
		String strObject = "134232.324221";
		 
		try{
		    
		double d = Double.parseDouble(strObject);
		    System.out.println("String to double: " + d);
		    
		}
		catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}
	}

}
