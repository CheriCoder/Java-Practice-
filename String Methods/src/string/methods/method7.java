package string.methods;
public class method7 {
    public static void main (String [] args){
        String a = "Hello\rWorld!";
        String b = "\n Hello\tWorld!";
        String c = "\n Hel\blo World!";
        String d = "\n Hello\fWorld!";
        System.out.println(a+""+b+""+c+""+d);
    }
}
