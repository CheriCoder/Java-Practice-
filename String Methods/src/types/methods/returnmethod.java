package types.methods;
public class returnmethod {
    static int myMethod(int x, int y){
        return x*y;
    }
    public static void main(String [] args){
        int z = myMethod(2,4);
        System.out.println(z);
    }
}
