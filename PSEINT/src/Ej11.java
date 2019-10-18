import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int sumax=0, suman=0, n, x, a=0;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			
			System.out.println("introduzca dos numeros para ver si son amigos");
			n=Integer.parseInt(teclado.readLine());
			x=Integer.parseInt(teclado.readLine());
			
			for (int i = 1; i <= (n/2); i++) {
				if(n%i==0) {
					suman = suman+i;
				}
			}
			
			for (int j = 1; j <= (x/2); j++) {
				if(x%j==0) {
					sumax = sumax+j;
				}
			}
			
			if (suman==x && sumax==n) {
				System.out.println(n+" y "+x+" son nº amigos");
			}else {
				System.out.println("no son amigos");
			}
			
			System.out.println("quiere probar de nuevo si(1) o no(2)");
			a=Integer.parseInt(teclado.readLine());
		
		} while (a!=2);

	}

}
