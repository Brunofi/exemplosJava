
public class TesteExcessoesChecadas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		//obrigatorio o uso do "try" pelo metodo solicitado ter possiveis excessoes
		try {
			cc.sacar(99);
			System.out.println(cc.saldo);
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
			
		}
		//finaly executa idependente se entrar no try ou no catch
		finally {
			System.out.println("obrigado por utilizar o sistema");
			
		}
		
		

	}

}
