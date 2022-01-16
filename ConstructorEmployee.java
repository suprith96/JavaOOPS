//Java Program to demonstrate the use of the parameterized constructor.  

class ConstructorEmployee{  
    int id;  
    String name;  
     
    ConstructorEmployee(int i,String n){  
    	id = i;  
    	name = n;  
    }  
    
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
      
    	ConstructorEmployee s1 = new ConstructorEmployee(01,"James");  
    	ConstructorEmployee s2 = new ConstructorEmployee(02,"Cameroon");  
        s1.display();  
        s2.display();  
   }  
}  

