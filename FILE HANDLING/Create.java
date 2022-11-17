/* CREATE A FILE IN A FOLDER*/

package questions;
import java.io.*;


public class Create {

   
    public static void main(String[] args) throws IOException {
        File f1 = new File("my folder");
         File f2 = new File("ab.txt");
         f1.mkdir();
         f2.createNewFile();
        System.out.println("new file created!!!");
       
    }
    
}
