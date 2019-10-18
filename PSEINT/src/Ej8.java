
public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumap=0, suman=0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				sumap = sumap+i;
			}else {
				suman = suman+i;
			}
		}
		System.out.println("la suma de los nº pares es: "+sumap
				+"\nla suma de los nº impares es: "+suman);
	}

}
