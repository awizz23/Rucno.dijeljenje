package rucno.dijeljenje;
import java.util.*;
public class RucnoDijeljenje {

       public static void main(String[] args) {
        
           Scanner tastatura = new Scanner (System.in);
           System.out.println("Unesite djeljenik:");
           int a = tastatura.nextInt();
           System.out.println("Unesite djelilac:");
           int b = tastatura.nextInt();
           
           System.out.println("Unesite broj decimala: ");
           
           int n = tastatura.nextInt();
           int c = a/b;
           System.out.println(c+", ");
           for (int d=0;d<n;d++)
           {
               int e = a%b;
               a = e*10;
               int f=a/b;
               System.out.print(f);
           }
         
    }
    
}
