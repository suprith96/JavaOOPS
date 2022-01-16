
import java.util.*;
  
class CollectionDemo {
  
    public static void main(String[] args)
    {
        
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector<Integer>();
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
  
        v.addElement(1);
        v.addElement(2);
  
        h.put(1, "Hello");
        h.put(2, "Good Morning");
  
        System.out.println(arr[2]);
        System.out.println(v.elementAt(1));
        System.out.println(h.get(2));
  
    }
}