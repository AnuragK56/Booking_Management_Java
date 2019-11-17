package display;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class display {
   public void displayAll() throws FileNotFoundException {
        int i = 0;
        Scanner scanner = new Scanner(new File("C:\\Users\\anura\\Documents\\Booking Management\\src\\data.csv"));
        
        while (scanner.hasNextLine()) {
        	 if(i==0 || i==1)
         	{
         	   for(int x=0;x<207;x++)
                {
                	System.out.print("-");
                }
                System.out.println("");
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
        for(int x=0;x<207;x++)
        {
        	System.out.print("-");
        }
        System.out.println("");
        scanner.close();

    }

   public void displayParticular(String name) throws FileNotFoundException {
        int i = 0;
        Scanner scanner = new Scanner(new File("C:\\Users\\anura\\Documents\\Booking Management\\src\\data.csv"));

        while (scanner.hasNextLine()) {
        	int c=0;
            String line = scanner.nextLine();
            String[] result = line.split(",");
            if(i==0 || i==1)
        	{
        	   for(int x=0;x<207;x++)
               {
               	System.out.print("-");
               }
               System.out.println("");
        	}
            for(int j=0;j<7;j++)
            {
            	
            	if ((result[0].toLowerCase()).equals(name.toLowerCase())|| i==0)
            	{	c=1;
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

        for(int x=0;x<207;x++)
        {
        	System.out.print("-");
        }
        System.out.println("");
        scanner.close();
    }
}
