package display;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class display {
	public void lineadder()
	{
		   for(int x=0;x<207;x++)
           {
           	System.out.print("-");
           }
           System.out.println("");
	}
   public void displayAll() throws FileNotFoundException {
	
        int i = 0;
        Scanner scanner = new Scanner(new File("C:\\Users\\anura\\Documents\\Booking Management\\src\\data.csv"));
        
        while (scanner.hasNextLine()) {
        	 if(i==0 || i==1)
         	{
        		 lineadder();
         	}
        	
            String line = scanner.nextLine();
            String[] result = line.split(",");
            for(int j=0;j<7;j++)
            {
            		System.out.print(result[j]); 
            		for(int k=result[j].length();k<30;k++)
            		{
            			if(k==20)
            			System.out.print("|");
            			System.out.print(" ");   
            		}
            		     	
            }
            	System.out.println();
            i++;
        }
       lineadder();
        scanner.close();
   

    }

   public void displayParticular(String name) throws FileNotFoundException {
	   System.out.println("All the  Booking of " + name + " are :");
        int i = 0,check=0;
        Scanner scanner = new Scanner(new File("C:\\Users\\anura\\Documents\\Booking Management\\src\\data.csv"));

        while (scanner.hasNextLine()) {
        	int c=0;
            String line = scanner.nextLine();
            String[] result = line.split(",");
            if(i==0 || i==1)
        	{
        	  lineadder();
        	}
            for(int j=0;j<7;j++)
            {
            	
            	if ((result[0].toLowerCase()).equals(name.toLowerCase())|| i==0)
            	{	c=1;
            	check=1;
            		System.out.print(result[j]); 
            		for(int k=result[j].length();k<30;k++)
            		{
            			if(k==20)
            			System.out.print("|");
            			System.out.print(" ");   
            		}
            		}          	
            }
            if(c==1)
           	System.out.println();
            i++;
      }
        lineadder();
        if(check==0)
        	System.out.println("Sorry There are No Booking for:"+name);
        scanner.close();
    }
   public void displayParticular(String mod,String s) throws FileNotFoundException {
	   System.out.println("All the  Booking of " + mod+ " are :");
        int i = 0,check=0;
        Scanner scanner = new Scanner(new File("C:\\Users\\anura\\Documents\\Booking Management\\src\\data.csv"));

        while (scanner.hasNextLine()) {
        	int c=0;
            String line = scanner.nextLine();
            String[] result = line.split(",");
            if(i==0 || i==1)
        	{
        	  lineadder();
        	}
            for(int j=0;j<7;j++)
            {
            	
            	if ((result[2].toLowerCase()).equals(mod.toLowerCase())|| i==0)
            	{	c=1;
            	check=1;
            		System.out.print(result[j]); 
            		for(int k=result[j].length();k<30;k++)
            		{
            			if(k==20)
            			System.out.print("|");
            			System.out.print(" ");   
            		}
            		}          	
            }
            if(c==1)
           	System.out.println();
            i++;
      }
        lineadder();
        if(check==0)
        	System.out.println("Sorry There are No Booking for:"+mod);
        scanner.close();
    }
   public void endStatement() {
	   for(int i=0;i<50;i++)
		   System.out.print("#");
	   System.out.print("  THANK YOU FOR USING BOOKING MANAGEMENT SYSTEM  ");
	   for(int i=0;i<50;i++)
		   System.out.print("#");
   }
}
