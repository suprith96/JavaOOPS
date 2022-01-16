
public class SPDTlong {

	public static void main(String[] args) {
		String strObject = "3212343";
		 
		try{
		    
		long l = Long.parseLong(strObject);
			System.out.println("String to long: " + l);
		    
		}
		catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}

	}

}
