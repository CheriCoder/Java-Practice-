package types.methods;
import java.util.Scanner;
public class Switchmethod {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter day number:");
        int d = sc.nextInt();
        switch (d){
            case 1 -> System.out.println("Today is monday");
            case 2 -> System.out.println("Today is tuesday");
            case 3 -> System.out.println("Today is wednesday");
            case 4 -> System.out.println("Today is thursday");
            case 5 -> System.out.println("Today is friday");
            case 6 -> System.out.println("Today is saturday");
            case 7 -> System.out.println("Today is sunday");
            default -> System.out.println("Wrong input");
        }        
}
}
