import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, num, a = 0;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random(System.currentTimeMillis());
		num = random.nextInt(100)+1; 
		
		System.out.println(num);
		
		do {
			
			System.out.println("Ingrese un numero:");
			n=Integer.parseInt(teclado.readLine());
			
			if(n>num) {
				System.out.println("Demasiado alto, pruebe otra vez");
				a++;
				
			}else {
				System.out.println("Demasiado bajo, pruebe otra vez");
				a++;
			}
		
		} while (n!=num);
		
		System.out.println("ENHORABUENA! ACERTASTE"
				+ "\nnº de intentos: "+a);

	}

}
