package types.methods;
public class methodmath {
    public static void main ( String [] args){
        int a = 25;
        int b = -69;
        int c = 707;
        System.out.println ("The numbers are:"+"A="+a+"\t B="+b+"\t C="+c);
        System.out.println("Bigger number is:"+ Math.max(a,c));
        System.out.println("Smaller number is:"+ Math.min(a,b));
        System.out.println ("Square root of a is:"+Math.sqrt(25));
        System.out.println("The absolute value of b is:"+Math.abs(-69));
        System.out.println("Your lucky number is:"+Math.random()*101);
    }
    
}
