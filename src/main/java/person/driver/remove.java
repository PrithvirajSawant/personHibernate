package person.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import person.entities.Person;

public class remove {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Person p1=em.find(Person.class,102);
		em.remove(p1);
		System.out.println("Data Removed");
		et.commit();
	}
}
