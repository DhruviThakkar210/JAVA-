package filehandling2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileHandling2 {
    void readData() throws IOException
    {
        
        FileInputStream fin=new FileInputStream("sanu.txt");
        int i=0;
        int character=0;
        while((fin.read())!=-1)
        {
        
            i++;
            
        }
        System.out.println(""+i);
    }
    void writeData() throws FileNotFoundException, IOException
    {
           FileOutputStream fout;
       
            fout = new FileOutputStream("sanu.txt");
              String s="Welcome to my World";
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        }

    public static void main(String[] args) {
     try{
         FileHandling2 obj=new FileHandling2();
         obj.writeData();
            obj.readData();
      
      
        } catch (Exception ex) {
            Logger.getLogger(FileHandling2.class.getName()).log(Level.SEVERE, null, ex);
        } 
      
    
     
        
    }

    
}