
package questions;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Read {
    public static void main(String[] args) throws IOException {
        File f1 = new File("dhruvi.txt");
    if(!f1.exists()) 
    {
        try {
            f1.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    FileReader f2 = new FileReader(f1);
    BufferedReader f3 = new  BufferedReader(f2);
    String line ;
    while((line=f3.readLine())!=null)
    {
        System.out.println(line);
    }
    
    f3.close();
    
}

    }
