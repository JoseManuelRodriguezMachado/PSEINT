import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int p, lm, si, ed, bd, fol;
		
		System.out.println("Introduzca las notas del alumno.");
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		p=Integer.parseInt(teclado.readLine());
		lm=Integer.parseInt(teclado.readLine());
		si=Integer.parseInt(teclado.readLine());
		ed=Integer.parseInt(teclado.readLine());
		bd=Integer.parseInt(teclado.readLine());
		fol=Integer.parseInt(teclado.readLine());
		
		int media = (p+lm+si+ed+bd+fol)/6;
		
		System.out.println("la media del alumno es de: "+media);
	}

}
