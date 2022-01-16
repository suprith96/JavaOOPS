import java.util.ArrayList;
import java.util.Iterator;
public class StringInArrayOfStrings {

   public static void main(String[] args){
      ArrayList <String> list = new ArrayList<String>();
      
      list.add("JavaFX");
      list.add("Java");
      list.add("WebGL");
      list.add("OpenCV");
      list.add("OpenNLP");
      list.add("Java FSD");
      list.add("JOGL");
      list.add("Hadoop");
      list.add("HBase");
      list.add("Java Script");
      list.add("Flume");
      list.add("Mahout");
      list.add("Impala");
      System.out.println("Contents of the array list: ");
      for (String element : list){
         if (element.contains("Java")){
               System.out.println(element);
         }
      }
   }
}