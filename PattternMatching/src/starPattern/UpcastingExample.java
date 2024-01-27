package starPattern;

class  Parent{  
	   void PrintData1() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child extends Parent {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
	      Parent obj1 = new Child();  
	      Parent obj2 = new Child();   
	      obj1.PrintData1();  
	      obj2.PrintData1();  
	   }  
	}  