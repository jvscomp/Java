package aula;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		Calendar nasc = null;
		Socio socio = new Socio("Ana", "1234-5678", nasc);
		
		
		//carrega configuração da unidade de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jvs");
		
		//métodos do JPA
		EntityManager em = emf.createEntityManager();
		
		//abre transação
		em.getTransaction().begin();
		
		//executa sql insert
		em.persist(socio);
		
		//grava objeto
		em.getTransaction().commit();
		
		em.close();
	}
}
