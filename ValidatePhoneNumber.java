import java.util.Scanner;
import java.util.regex.*;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "[0-9]{10}";
        String a = "[A-Z][a-z]*[0-9][a-z]*";
        String b = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        String c = "[?=.*?[A-Z a-z 0-9] (?=.?[@]) (?=.?[a-z]) (?=.?[.]) (?=.?[a-z]{2,3}) ] "

        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a phone number : ");
        String phoneNumber = scanner.nextLine();

             System.out.print("Enter name but first letter should be capital should have one digit also: ");
        String name = scanner.nextLine();
        System.out.print("Enter pass but it should have everything: ");
        String pass = scanner.nextLine();

        if (phoneNumber.matches(regex)) {
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Phone number is invalid");
        }
         if (name.matches(a)) {
            System.out.println("name is valid");
        } else {
            System.out.println("name is invalid");
        }
        if (pass.matches(b)) {
            System.out.println("pass is valid");
        } else {
            System.out.println("pass is invalid");
        }

 /*if (email.matches(c)) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid");
        }
*/
        // Close the scanner to free up resources
        scanner.close();
    }
}
