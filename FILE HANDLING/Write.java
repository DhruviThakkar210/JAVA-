


package questions;

import java.io.*;

public class Write 
{
    public static void main(String[] args) throws IOException {
        File f1 = new File("dhruvi.txt");
      f1.createNewFile();
      FileWriter f2 = new FileWriter(f1);
      f2.write("hello dhruvi's wrote here!!");
      f2.flush();
      f2.close();
        System.out.println("writen successfully!!");
      
      
    }
    
}
