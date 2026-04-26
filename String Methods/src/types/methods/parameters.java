package types.methods;
public class parameters {
    static void myMethod(String fname, int age){
        System.out.println (fname+"\tis\t"+age);
    }
    public static void main (String [] args){
        myMethod("Arvind",50);
        myMethod("Swati",44);
        myMethod("Oorja",20);
    }
}
