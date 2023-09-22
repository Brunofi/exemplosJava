package staticFinal;

public class MatematicaUtil {
	final  static double  PI=3.14;
	
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	
	public static double calcularAreaCirculo(double raio) {
		double area = Math.pow(raio, 2) * MatematicaUtil.PI;
		
		return area;
	
	}
}
