import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, n1, n2, n3, n4;
		
		
		System.out.println("Introduzca un numero de 4 cifras");
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(teclado.readLine());
		
		n1=n/1000;
		n2=(n%1000)/100;
		n3=(n%1000)%100/10;
		n4=(n%1000)%100%10;
		
		System.out.println("la primera cifra es: "+n1);
		System.out.println("la segunda cifra es: "+n2);
		System.out.println("la tercera cifra es: "+n3);
		System.out.println("la cuarta cifra es: "+n4);
			
				
							
	}

}
