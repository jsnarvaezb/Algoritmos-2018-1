//byte —>11—> 89

import java.util.*;

class main {

    public static byte fibonacci(int n) {
        byte f=0;
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            byte a=0;
            byte b=1;

            for(int i=2; i<=n; i++){
                f= (byte)(a+b);
                a=b;
                b=f;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
