package project22;
import java.io.BufferedOutputStream; 
import java.io.DataInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 

public class AppendFile 
{ 
    public static void main(String[] args) throws IOException  
    { 
        
        DataInputStream dis=new DataInputStream(System.in); 
  
        
        FileOutputStream fout=new FileOutputStream("Abeds-MacBook-Pro:Desktop abed$ cd FileHandling\\\\test.txt",true); 
  
        
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end): "); 
        char ch; 
  
        
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        } 
        
        bout.close(); 
    } 
} 
