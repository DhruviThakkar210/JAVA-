public class Palindrome {

    public static void main(String[] args) {
      //to find the length of the string 
        String s1=new String("madam");
       String reverse=""; 
        for(int i=s1.length()-1,j=0;i>=0;i--,j++)
        {
            reverse=reverse+s1.charAt(i);
        }
        
        
        System.out.println("original string is "+s1);
        System.out.println("Reverse  "+reverse);

        if (s1.equals(reverse)) 
        {
          System.out.println("string is palindrome");
        }

        else 
        {
          System.out.println("string is not palindrome");
        }
       
}
}