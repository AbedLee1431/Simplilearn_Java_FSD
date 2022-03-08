package project22;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {
  public static void main(String args[]) {

    String data = "This is the data in the output file";
    
    try {
      
      FileWriter output = new FileWriter("Abeds-MacBook-Pro:Desktop abed$ cd FileHandling\\\\testwrite.txt");
      
    
      output.write(data);
      System.out.println("Data is written to the file.");

      
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}