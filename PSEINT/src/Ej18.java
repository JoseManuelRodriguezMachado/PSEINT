import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, cn=0, suma1=0, suma2=0;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("introduzca un limite");
		n=Integer.parseInt(teclado.readLine());
		
		for (int i = 2; i <= n-1; i++) {
			
			for (int j = 1; j <= i-1; j++) {
				suma1 = suma1 + j;
			}
			
			for (int j = i+1; j <= n; j++) {
				suma2 = suma2 + j;
			}
			
			if(suma1==suma2) {
				cn = i;
			}
		}
		
		if(cn==0) {
			System.out.println("no se encontro un centro numerico");
		}else {
			System.out.println("el centro numerico de "+n+" es "+cn);
		}
	}
}
