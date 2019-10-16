import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n, c=0, spos=0, sneg=0, pos=0, neg=0;
		
	for (int i = 1; i <=10; i++) {
		System.out.println("introduzca un numero:");
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(teclado.readLine());
		
		if(n>0) {
			spos = spos+n;
			pos = pos+1;
		
		}else if(n<0){
			sneg = sneg+n;
			neg = neg+1;
		
		}else if(n==0) {
			c = c+1;
		}
	}
	System.out.println("la media de los nº positivos es: "+spos/pos);
	System.out.println("la media de los nº negativos es: "+sneg/neg);
	System.out.println("el nº de cero es de: "+c);
}
}
