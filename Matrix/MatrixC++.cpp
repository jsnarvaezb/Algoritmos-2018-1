#include <iostream>
#include <ctime>
#include <time.h>
using namespace std;

int main() {
	int n=100;

	for(int i=2; i<n; i++){
		clock_t start, end;
		int a[i][i];
		int b[i][i];
		int c[i][i];
		for(int j=0;j<i; j++){
			for(int k=0; k<i;k++){
				a[j][k]=1;
				b[j][k]=2;
			}
		}

		start=clock();

		for (int z=0;z<i;z++){
			for (int j=0;j<i;j++){
				for (int k=0;k<i;k++){
					c[z][j]=c[z][j]+a[z][k]*b[k][j];
				}
			}
		}
		end=clock();
		double time= (double(end-start)/ (CLOCKS_PER_SEC/1000));

		cout <<"n="<< i<< ". Tiempo de ejecucion: " << time << endl;
	}
	return 0;
}
