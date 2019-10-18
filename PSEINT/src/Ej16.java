import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		double b, b1, c, d, d1, e, e1, s, tp, te, r, pc, ps, pp, cl, cv, x;
		
		
		
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Bienvenido, ¿que semilla prefiere?"
					+"\n1 - tomate"
					+"\n2 - repollo"
					+"\n3 - patata"
					+"\n4 - cebolla");
			a=Integer.parseInt(teclado.readLine());
			
			switch (a) {
			
			case 1:
				
				System.out.println("¿Que tipo de semilla desea?"
						+"\n1 - pera"
						+"\n2 - ensalada");
				b=Integer.parseInt(teclado.readLine());
				
				if(b==1) {
					System.out.println("¿Cuantas semillas desea?");
					b1=Integer.parseInt(teclado.readLine());
					 tp = b1*0.15;

				}else if(b==2) {
					System.out.println("¿Cuantas semillas desea?");
					b1=Integer.parseInt(teclado.readLine());
					te = b1*0.20;
				}

				break;
			
			case 2:
				
				System.out.println("¿Cuantas semilla desea?");
				c=Integer.parseInt(teclado.readLine());
				r = c*0.10;

				break;
			
			case 3:
				
				System.out.println("¿Que tipo de semilla desea?"
						+"\n1 - criolla"
						+"\n2 - pastusa"
						+"\n3 - salentuna");
				d=Integer.parseInt(teclado.readLine());
				
				if(d==1) {
					System.out.println("¿Cuantas semilla desea?");
					d1=Integer.parseInt(teclado.readLine());
					pc = d1*0.08;
				
				}else if(d==2) {
					System.out.println("¿Cuantas semilla desea?");
					d1=Integer.parseInt(teclado.readLine());
					pp = d1*0.09;
					
				}else if(d==3) {
					System.out.println("¿Cuantas semilla desea?");
					d1=Integer.parseInt(teclado.readLine());
					ps = d1*0.11;
				}
	
				break;
			
			case 4:
				
				System.out.println("¿Que tipo de semilla desea?"
						+"\n1 - larga"
						+"\n2 - vieja");
				e=Integer.parseInt(teclado.readLine());
				
				if(e==1) {
					System.out.println("¿Cuantas semilla desea?");
					e1=Integer.parseInt(teclado.readLine());
					cl = e1*0.15;
				
				}else if(e==2) {
					System.out.println("¿Cuantas semilla desea?");
					e1=Integer.parseInt(teclado.readLine());
					cv = e1*0.13;
				}
				
				break;
			}
			
			System.out.println("¿Ha terminado su compra?"
					+"\nsi - 1"
					+"\nno - 2");
			s=Integer.parseInt(teclado.readLine());


		} while (s != 1);
		
		 x = tp + te + r+ pc+ ps+ pp + cl + cv;
		System.out.println("el total a pagar es de: "+  +"€");


	}

}
