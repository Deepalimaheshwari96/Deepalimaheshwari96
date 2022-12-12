package exceptionhandling.program3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program3 {
	public class BufferedReaderExample {
		 public static void main(String[] args) {
		  try (FileReader fr = new FileReader("C:\\Users\\Deepali.maheshwari\\Documents\\test.txt");
		    BufferedReader br = new BufferedReader(fr);) {
		   String sCurrentLine;

		   while ((sCurrentLine = br.readLine()) != null) {
		    System.out.println(sCurrentLine);
		   }
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 }
		}

}
