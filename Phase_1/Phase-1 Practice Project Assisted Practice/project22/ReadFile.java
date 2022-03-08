package project22;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
  public static void main(String[] args) {

    char[] array = new char[60];
    
    try {
      
      FileReader input = new FileReader("Abeds-MacBook-Pro:Desktop abed$ cd FileHandling\\test.txt");

   
      input.read(array);
      
      System.out.println("Data in the file:");
      System.out.println(array);

     
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}