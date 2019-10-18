import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, n1, n2, nmenor=0, nmayor=0, suma=0;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("valor de la baliza");
		n=Integer.parseInt(teclado.readLine());
		
		System.out.println("introduce la cantidad de numeros a comparar");
		n1=Integer.parseInt(teclado.readLine());
		
		for (int i = 1; i <= n1; i++) {
			System.out.println("introduce los numeros a comparar");
			n2=Integer.parseInt(teclado.readLine());
			
			if(n2<n) {
				nmenor = nmenor + 1;
			
			}else if(n2>n) {
				nmayor = nmayor + 1;
				suma = suma + n2;
			}			
		}
		
		System.out.println("hay "+nmayor+" nº mayores que la baliza"
				+"\nhay "+nmenor+" nº menores que la baliza"
				+"\n la suma de los nº mayores a la baliza es de: "+suma);
	}

}
