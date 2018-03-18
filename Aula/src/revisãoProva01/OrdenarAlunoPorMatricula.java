package revisãoProva01;

import java.util.Comparator;

public class OrdenarAlunoPorMatricula implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		if (a1.getMatricula() < a2.getMatricula()) {
			return -1;
		} else if (a1.getMatricula() == a2.getMatricula()) {
			return 0;
		} else {
			return 1;
		}
		
	}
	

}
