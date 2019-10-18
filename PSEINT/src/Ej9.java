import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, a, b;
		
		System.out.println("introduzca dos numeros (A y B)");
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(teclado.readLine());
		b=Integer.parseInt(teclado.readLine());
		
		do {
			System.out.println("¿Que operacion desea realizar?"
					+ "\n1-sumar nuemros"
					+ "\n2-restar numeros"
					+ "\n3-multiplicar numeros"
					+ "\n4-dividir numeros"
					+ "\n5-salir del programa");
			n=Integer.parseInt(teclado.readLine());
			
			switch (n) {
			case 1:
				System.out.println("la suma es: "+(a+b));
				break;
			case 2:
				System.out.println("la resta es: "+(a-b));
				break;
			case 3:
				System.out.println("la multiplicacion es: "+(a*b));
				break;
			case 4:
				do {
					if(a==0) {
						System.out.println("error, introduzca otro numero (A)");
						a=Integer.parseInt(teclado.readLine());	
					}else if(b==0) {
						System.out.println("error, introduzca otro numero (B)");
						b=Integer.parseInt(teclado.readLine());
					}
				} while (a==0 || b==0);
				System.out.println("la division es: "+(a/b));
				break;
			}
		} while (n<5);
		System.out.println("fin programa");
	}
}
