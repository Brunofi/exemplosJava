package enumeracao2;

public class Teste {

	public static void main(String[] args) {
		OperacaoAritimetica op1 = OperacaoAritimetica.ADICAO;
		OperacaoAritimetica op2 = OperacaoAritimetica.SUBTRACAO;
		
		int resultado1 = op1.operacao(5, 3);
		int resultado2 = op2.operacao(5, 3);
		
		for (OperacaoAritimetica oa: OperacaoAritimetica.values()) {
			System.out.println(oa + "->" + oa.operacao(10, 5));
		}

	}

}
