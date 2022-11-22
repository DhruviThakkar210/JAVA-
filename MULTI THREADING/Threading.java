class Threading extends Thread{  
public void run(){  
System.out.println("DHRUVI'S THREAD IS RUNNING");  
}  
public static void main(String args[]){  
Threading t1=new Threading();  
t1.start();  
 }  
} 