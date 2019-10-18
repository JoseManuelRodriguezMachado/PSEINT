import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n;
		
		System.out.println("introduzca la nota del alumno");
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(teclado.readLine());
		
		if(n>10) {
			System.out.println("no hay nadie tan listo, pruebe otra vez");
			n=Integer.parseInt(teclado.readLine());
		}else if(n>8){
			System.out.println("el alumno ha sacado un sobresaliente");
		}else if(n>6){
			System.out.println("el alumno ha sacado un notable");
		}else if(n>4) {
			System.out.println("el alumno ha sacado un bien");
		}else if(n>=0) {
			System.out.println("el alumno ha sacado un suspenso");
		}else {
			System.out.println("tampoco nos pasemos, prueba otra vez");
			n=Integer.parseInt(teclado.readLine());
		}
	}
}
