package types.methods;
public class forloopmethod {
    public static void main (String [] args){
        int i,j;
        for(i=0;i<=5;i++){
            System.out.println("Outer:"+i);
            for (j=0;j<=2;j++){
                System.out.println("Inner:"+j);
            }
            }
        }
    }