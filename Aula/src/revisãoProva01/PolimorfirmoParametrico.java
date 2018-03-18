package revisãoProva01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PolimorfirmoParametrico {

	public static void main(String[] args) {
		List<Integer> minhalista = new LinkedList<Integer>();
		minhalista.add(new Integer(0));
		minhalista.add(1);
		System.out.println(minhalista.toString());
		Map <String, Pessoa> envolvidos = new HashMap <String, Pessoa>();
		Pessoa p1 = new Funcionario("Ana", "12345", "0987", 1500.50);
		envolvidos.put("1", p1);
		System.out.println(envolvidos);
	}
}
