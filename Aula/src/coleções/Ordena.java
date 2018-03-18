package coleções;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ordena {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(12,"Joao");
		Aluno a2 = new Aluno(100,"Ana");
		Aluno a3 = new Aluno(7,"Carlos");
		
		List<Aluno> listaAlunos = new LinkedList<>();
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		listaAlunos.add(a3);
		
		///Collections.sort(listaAlunos);
		OrdenaAlunoPorNome criterio = new OrdenaAlunoPorNome();
		Collections.sort(listaAlunos, criterio);
		
		System.out.println(listaAlunos);
		
	}
}
