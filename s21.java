import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
		 static void collinear(int x1, int y1, int x2, 
                          int y2, int x3, int y3)
    {
         
        /* Calculation the area of 
        triangle. We have skipped 
        multiplication with 0.5 
        to avoid floating point 
        computations */
        int a = x1 * (y2 - y3) + 
                x2 * (y3 - y1) + 
                x3 * (y1 - y2);
     
        if (a == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    } 
         
    // Driver Code
    public static void main(String args[])
    {
        int x1 , x2 , x3 ,
            y1 , y2 , y3 ;
Scanner s=new Scanner(System.in);
x1=s.nextInt();
y1=s.nextInt();
x2=s.nextInt();
y2=s.nextInt();
x3=s.nextInt();
y3=s.nextInt();
                             
        collinear(x1, y1, x2, y2, x3, y3); 
 
   
	}
}
