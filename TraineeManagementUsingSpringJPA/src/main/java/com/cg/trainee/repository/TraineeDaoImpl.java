/**
 * 
 */
package com.cg.trainee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.trainee.entity.Trainee;

/**
 * @author AKASH
 *
 */


@Repository//@Component @Service
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entityManager;

	public void addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
	}

	public void updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
	}

	public void removeTrainee(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		entityManager.remove(trainee);

	}

	public Trainee getTraineeById(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		return trainee;
	}

	public List<Trainee> getAllTrainees() {
		Query q = entityManager.createQuery("select e from Trainee e");
		List<Trainee> l = q.getResultList();
		return l;
	}

}
