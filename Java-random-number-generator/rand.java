       
import java.util.Scanner;
import java.util.Random;
public class rand {
    
    public static void main(String[] args) {
       
   
        System.out.println("enter minimum value");
        Scanner sc  = new Scanner(System.in);
       int minnum = sc.nextInt();
        System.out.println("enter maximum value");       
       int maxnum = sc.nextInt();
         
       
         Random rand = new Random();
          int number;   
            
        
            number = minnum+  rand.nextInt(maxnum-minnum);
            System.out.println("a random number between " + minnum +" and " + maxnum +  " is " + number);
            
       
       
    }
}