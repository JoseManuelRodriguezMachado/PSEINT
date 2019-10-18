import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int sf, v, km, desp, dieta, kmt, rss=150;
		double irpf, comision, n, i, sl;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("introduzca el suelo fijo:");
		sf=Integer.parseInt(teclado.readLine());
		irpf = sf*0.18;
		
		System.out.println("introduzca el importe total de ventas:");
		v=Integer.parseInt(teclado.readLine());
		comision = v*0.05;
		
		System.out.println("introduzca los kilometros:");
		km=Integer.parseInt(teclado.readLine());
		kmt = km;
		
		System.out.println("introduzca los dias de desplazamiento:");
		desp=Integer.parseInt(teclado.readLine());
		dieta = desp*60;
		n = sf+comision+kmt+dieta;
		i = irpf+rss;
		sl = n-i;
		
		System.out.println("salario base: "+sf
				+"\ncomision por ventas (5%): "+comision
				+"\nkilometraje: "+kmt
				+"\ndietas: "+dieta
				+"\nIROF (18%): "+irpf
				+"\nretencion seguridad social: "+rss
				+"\nsueldo liquido: "+sl);
	}
}
