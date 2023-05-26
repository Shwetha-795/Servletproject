package Dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class StudentDao {
	EntityManagerFactory emf=PersistenceDelegate.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void
	save(Student s)
	{
		et.begin();
		em.persist();
		et.commit();
	}

}
