package strings;

public class StringIndexOf {
	
	public static void main(String[] args) {
		String s = "Java";
		int indice = s.indexOf('a');
		
		System.out.println(indice);
		
		indice = s.lastIndexOf('a');
		System.out.println(indice);
	}

}
