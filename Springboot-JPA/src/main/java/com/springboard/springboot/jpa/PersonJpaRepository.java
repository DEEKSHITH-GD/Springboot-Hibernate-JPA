package com.springboard.springboot.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class PersonJpaRepository {
	//Connect to the DB
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		
		return entityManager.find(Person.class, id);
	}

	public Person update(Person person) {	
		return entityManager.merge(person);
	}
	
	public Person insert(Person person) {	
		return entityManager.merge(person);
	}
	
	public void deletebyId(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
	
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
	
}
