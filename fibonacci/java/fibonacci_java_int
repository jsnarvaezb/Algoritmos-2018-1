//Int —> 46 —> 1836311903

import java.util.*;

class main {

    public static int fibonacci(int n) {
        int f=0;
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            int a=0;
            int b=1;

            for(int i=2; i<=n; i++){
                f=a+b;
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
