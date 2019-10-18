import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a, n;
		a=0;
		
		System.out.println("Ingrese un numero");
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(teclado.readLine());
		
		if(n<1) {
			do {
				System.out.println("error, introduzca un numero mayor a 0");
				n=Integer.parseInt(teclado.readLine());
			} while (n<0);
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println(3*i);
			a++;
		}
		
		System.out.println("se ha mostrado "+a+" numeros");
	}
}
