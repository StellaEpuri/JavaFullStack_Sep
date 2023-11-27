/**
 * 
 */
package com.cg.trainee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.entity.Trainee;
import com.cg.trainee.repository.TraineeDao;

/**
 * @author AKASH
 *
 */

@Service("service")//TraineeServiceImpl service=new TraineeServiceImpl()
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;

	public void addTrainee(Trainee trainee) {
		dao.addTrainee(trainee);
	}

	public void updateTrainee(Trainee trainee) {
		dao.updateTrainee(trainee);
	}
	
	public void removeTrainee(int traineeId) {
		dao.removeTrainee(traineeId);
	}

	public Trainee getTraineeById(int traineeId) {
		return dao.getTraineeById(traineeId);
	}

	public List<Trainee> getAllTrainees() {

		return dao.getAllTrainees();
	}

}
