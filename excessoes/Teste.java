
public class Teste {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-5);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
