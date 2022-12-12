package exceptionhandling.program7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
        	 LinkedList list = new LinkedList();
             list.add(new Integer(2));
             list.add(new Integer(8));
             list.add(new Integer(5));
             list.add(new Integer(1));
             Iterator i = list.iterator();
             Collections.reverse(list);
 	    while(i.hasNext())
 	        System.out.print(i.next() + " ");
            // Creating an exception
            NumberFormatException ex =
                       new NumberFormatException("Exception");
  
            // Setting a cause of the exception
            ex.initCause(new NullPointerException(
                      "This is actual cause of the exception"));
  
            // Throwing an exception with cause.
            throw ex;
        }
  
        catch(NumberFormatException ex)
        {
            // displaying the exception
            System.out.println(ex);
  
            // Getting the actual cause of the exception
            System.out.println(ex.getCause());
        }
    }
}