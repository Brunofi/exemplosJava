
public class EstruturasRepeticao {

	public static void main(String[] args) {
		int numero = 10;
		
		
		//while
		while (numero < 20) {
			numero++;
			System.out.println(numero);

		}

		
		//do while
		do {

			numero++;
			System.out.println(numero);

		} while (numero < 20);
		
		
		
		//for
		for(int n = 0;n<=10;n++) {
			System.out.println(n);
			
		}
		
		//for com break
				for(int n = 0;n<=10;n++) {
					System.out.println(n);
					if(n==5) {
						break;
					}
					
					
				}
				
				System.out.println("O programa termina o for e continua o Algoritimo");

	}

}
