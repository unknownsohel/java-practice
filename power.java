import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base: ");
        int a = sc.nextInt();
        System.out.println("Enter exponent: ");
        int b = sc.nextInt();
        System.out.println(a+ " raised to  the power "+b+" is "+pow(a,b));

    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        if(b%2==0){
            int call =  pow(a, b/2);
            return call*call;
        }else{
            int call =  pow(a, b/2);
            return a*call*call;
        }
    }
    
}
