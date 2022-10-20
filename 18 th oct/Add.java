
import java.util.Scanner;
class Add
{


	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];


      void getdataa()
      {
		 Scanner sc=new Scanner(System.in);

		 System.out.println("enter the value of 3*3 matrix / m");
         for (int i=0;i<3 ;i++ ) {

	     for (int j=0;j<3 ;j++ ) {

		  a[i][j] = sc.nextInt();		
	          }  
	
        }
    }


 void displaya()
      {

         for (int i=0;i<3 ;i++ ) {

	     for (int j=0;j<3 ;j++ ) {

		 System.out.print(a[i][j]  );		
	          } 
	          System.out.println(); 
	
        }
    }


 void getdatab()
      {
		Scanner sc=new Scanner(System.in);
         for (int i=0;i<3 ;i++ ) {

	     for (int j=0;j<3 ;j++ ) {

		  b[i][j] = sc.nextInt();		
	          }  
	
        }
    }
       
void displayb()
      {

         for (int i=0;i<3 ;i++ ) {

	     for (int j=0;j<3 ;j++ ) {

		 System.out.print(b[i][j]  );		
	          } 
	          System.out.println(); 
	
        }
    }

       

       void add()
       {

		for (int i=0;i<3 ;i++ ) {

	     for ( int j=0;j<3 ;j++ )
	      {

		      c[i][j] = a[i][j]+b[i][j];
		      System.out.print(c[i][j]); 
	
	       } 
	       System.out.println();
	          
       }
   



 void diagonal()
 {
   for(int i=0;i<3;i++)
   {
   	for(int j=0;j<3;j++)
   	{
   		if( i==  j)
   		{
   			System.out.println( "diagonals element are" + a[i][j]);
   		}


   		
   	}
   }

}

       void transpose()
       {

		for (int j=0;j<3 ;j++ ) {

	     for ( int i=0;i<3 ;i++ )
	      {

		     
		      System.out.print(a[i][j] + "\t"); 
	
	       } 
	       System.out.println();
	          
       }


void 


public static void main(String[] args) {
	Add p = new Add();
	p.getdataa();
    p.displaya();
	p.getdatab();
	p.displayb();
	p.add();
	p.diagonal();
	p.transpose();
   

}

   
}