//long —> 92 —>  7540113804746346429

import java.util.*;

class main {

  public static long fibonacci(int n) {
      long f=0;
      if (n==0){
          return 0;
      }else if (n==1){
          return 1;
      }else{
          long a=0;
          long b=1;

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
