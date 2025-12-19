package javaprogramming;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class LogPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File file = new File("log.txt");

		    try {

		      // trying to create a file based on the object
		      boolean value = file.createNewFile();
		      if (value) {
		        System.out.println("The new file is created.");
		      }
		      else {
		        System.out.println("The file already exists.");
		      }
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
		    String data = "Book order placed at [your preferred time]";
		     try {
		       // Creates a Writer using FileWriter
		       FileWriter output = new FileWriter("log.txt");

		       // Writes string to the file
		       output.write(data);
		       System.out.println("Data is written to the file.");

		       // Closes the writer
		       output.close();
		     }
		     catch (Exception e) {
		       e.getStackTrace();
		     }
		     char[] array = new char[100];
		     try {
		       // Creates a reader using the FileReader
		       FileReader input = new FileReader("log.txt");

		       // Reads characters
		       input.read(array);
		       System.out.println("Data in the file:");
		       System.out.println(array);

		       // Closes the reader
		       input.close();
		     }
		     catch(Exception e) {
		       e.getStackTrace();
		     }
		     
		     
//		     deletes the file
		     boolean value = file.delete();
		     if(value) {
		       System.out.println("The File is deleted.");
		     }
		     else {
		       System.out.println("The File is not deleted.");
		     }
		}
	
	}
