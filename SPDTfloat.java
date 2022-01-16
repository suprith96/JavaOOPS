
public class SPDTfloat {

	public static void main(String[] args) {
		String strObject = "2342.4";
		 
		try{
		    
		    float f = Float.parseFloat(strObject);
		    System.out.println("String to float: " + f);
		    
		}catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}
	}

}
