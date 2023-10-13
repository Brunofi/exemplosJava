package numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Teste2 {

	public static void main(String[] args) {
		double valorProduto = 10.5;
		
		BigDecimal bg = new BigDecimal(valorProduto);
		BigDecimal resultado = bg.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		String valorFormatado = formatador.format(resultado.doubleValue());
		System.out.println("10% do valor é: " + valorFormatado);

	}

}
