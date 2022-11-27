import java.util.Scanner;

public class Anagram { 
    public static void main(String[] args)

    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string");

        String str = sc.next(); 
        System.out.println("String is:-"+str);
        System.out.println("Anagram of the given string is:-");
        int size = str.length(); 
        Anagram a = new Anagram(); 
        a.anagm(str, 0, size - 1); 
    } 
    private void anagm(String str, int start, int end) 
    { 
        if (start == end) 
            System.out.println(str); 
        else { 
            for (int i = start; i <= end; i++) { 
                str = swap(str, start, i); 
                anagm(str, start + 1, end); 
                str = swap(str, start, i); 
            } 
        } 
    } 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}