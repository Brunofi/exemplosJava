package hashmap;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno(1,"João");
		Aluno a2 = new Aluno(2,"Maria");
		Aluno a3 = new Aluno(3,"José");
		Aluno a4 = new Aluno(4,"Pedro");
		
		//map sempre vai precisar de uma chave e um valor
		Map<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
		
		alunos.put(a1.getId(), a1);
		alunos.put(a2.getId(), a2);
		alunos.put(a3.getId(), a3);
		alunos.put(a4.getId(), a4);
		alunos.put(a4.getId(), a3);
		
		
		imprimirAlunos(alunos);
		
		Aluno alunoRecuperado = alunos.get(3);//passando a chave como parametro
		System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome());
	}

	private static void imprimirAlunos(Map<Integer, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
