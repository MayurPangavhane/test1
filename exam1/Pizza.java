
package exam1;
import java.util.Scanner;
public class  Pizza {
	  public   static   void   main(String  args[] ) {
		  
	    Scanner  sc = new  Scanner(System.in);
	   
	    
	    while(true) {
	    	
	    	System.out.println("1- Pizza Rs. 100");
	    	System.out.println("2- MuttonTopping Rs. 120");
	        System.out.println("3- Chicken Topping Rs. 120");
	        System.out.println("4- To Exit");
	          
	        int  ch= sc.nextInt();
	        if(ch==4)
	        	break;
	        
	        Pizza  fd=null; 
	        if(ch==1) {    
	        	Pizza  pz = new  Pizza();  
	        	fd = pz;
	        }else  if(ch==3)
	        	fd = new  ChickenPizza();  
	        else  if(ch==2)
	        	fd = new   MuttonPizza ();  
   
	    }
	    sc.close();
	}};