
public class SPDTint {

	public static void main(String[] args) {
		String strObject = "1213";
		 
		try{
		    
		    int i = Integer.parseInt(strObject);
		    System.out.println("String to int: " + i);
		    
		}
		catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}
	}

}
