import java.util.*;
 public class HashMap {
    public static void main(String args[])
    {
       
        HashMap hm1 = new HashMap();
 
        HashMap hm2 = new HashMap();
 
        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");
 
        hm2.put(new Integer(1), "Geeks");
        hm2.put(new Integer(2), "For");
        hm2.put(new Integer(3), "Geeks");
 
        System.out.println(hm1);
        System.out.println(hm2);
    }

	private void put(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}