package oops.program9;


public class Main {
   private static int count;
   public Main() {
	   count++;
   }
   public static void main(String args[]) {
	   Main m1 = new Main();
	   Main m2 = new Main();
	   Main m3 = new Main();
	   Main m5 = new Main();
	   System.out.println("Number of object is = "+count);
	   System.out.println(m1.hashCode());
	   m1 = null;
	   System.gc();
	}
   
   @Override  
   protected void finalize()   
   {   
       System.out.println("finalize method called");   
   } 
} 
