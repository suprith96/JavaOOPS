
//Java program to demonstrate conversion from
//String to StringBuffer and StringBuilder

public class SSBSB {

 public static void main(String[] args)
 {
     String str = "hello!";
     StringBuffer sbr = new StringBuffer(str);

     sbr.reverse();

     System.out.println(sbr);

     StringBuilder sbl = new StringBuilder(str);

     sbl.append("good morning");
     
     System.out.println(sbl);
 }
}