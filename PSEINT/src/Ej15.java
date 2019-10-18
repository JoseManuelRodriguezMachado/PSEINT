import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, x, m1 = 0, m2 = 0;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("introduzca los numeros a desear");
		n=Integer.parseInt(teclado.readLine());
		
		for (int i = 0; i <n; i++) {
			System.out.println("escriba los "+n+" numeros");
			x=Integer.parseInt(teclado.readLine());
			
			if(x>m1) {
				if(x>m2) {
					m1 = m2;
					m2 = x;
				}else {
					m1 = x;
				}
			}
		}
		
		System.out.println("los dos nº mayores de la secuencia son: "+m1+" y "+m2);
	}
}
