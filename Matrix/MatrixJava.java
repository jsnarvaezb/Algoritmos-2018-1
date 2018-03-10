
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=100;
		int a[][];
		int b[][];
		int c[][];
		for(int i=2; i<n+2; i++){
			a= new int[i][i];
			b= new int[i][i];
			c= new int[i][i];
			for(int j=0; j<i;j++){
				for(int k=0; k<i;k++){
					a[j][k]=1;
					b[j][k]=2;
				}
			}

			double startTime = System.nanoTime();

			for (int z = 0; z < i; z++) {
            			for (int j = 0; j < i; j++) {
            				for (int k = 0; k < i; k++) {
            					// aquí se multiplica la matriz
            					c[z][j] += a[z][k] * b[k][j];
            				}
				}
			}
			double endTime = System.nanoTime();

			double t = (endTime-startTime);
			System.out.println("n="+i+". Tiempo de ejecucion: "+t/1e6+" ms");
			endTime=startTime=0;
		}
	}
}
