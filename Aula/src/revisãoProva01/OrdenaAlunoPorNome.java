package revisãoProva01;

import java.util.Comparator;

public class OrdenaAlunoPorNome implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return a1.getNome().compareTo(a2.getNome());
	}

}
