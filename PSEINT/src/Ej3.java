import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, contador=0;
		
		System.out.println("Introduzca un numero");
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(teclado.readLine());
		
		do {
			if(n<1 || n>100) {
				System.out.println("error, pruebe ota vez");
				n=Integer.parseInt(teclado.readLine());
			}
		} while (n<=1 || n>=100);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%j==0) {
					contador=contador+1;
				}
			}
			if(contador==2) {
				System.out.println(i+" es primo");	
			}
			contador=0;
		}
	}
}	

