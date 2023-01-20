package teste;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno = new Aluno("Joao", LocalDate.now(), "Rua Matacavalos, 10");
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.close();

	}

}
