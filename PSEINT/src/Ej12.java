import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int dado, n, d1=0, d2=0, d3=0, d4=0, d5=0, d6=0;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("¿Cuantas veces desea tirar el dado?");
		n=Integer.parseInt(teclado.readLine());
		
		for (int i = 0; i <n; i++) {
			Random r = new Random();
			dado = r.nextInt(6)+1;
			
			if(dado==1) {
				d1++;
			}else if(dado==2) {
				d2++;
			}else if(dado==3) {
				d3++;
			}else if(dado==4) {
				d4++;
			}else if(dado==5) {
				d5++;
			}else if(dado==6) {
				d6++;
			}
		}
		
		System.out.println("el 1 ha salido "+(d1/n)*100+"%"
				+ "\nel 2 ha salido "+(d2/n)*100+"%"
				+ "\nel 3 ha salido "+(d3/n)*100+"%"
				+ "\nel 4 ha salido "+(d4/n)*100+"%"
				+ "\nel 5 ha salido "+(d5/n)*100+"%"
				+ "\nel 6 ha salido "+(d6/n)*100+"%");
	}
}
