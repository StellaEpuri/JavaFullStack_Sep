package com.cg.trainee.repository;

import java.util.List;

import com.cg.trainee.entity.Trainee;

public interface TraineeDao {
	void addTrainee(Trainee trainee);

	void updateTrainee(Trainee trainee);

	void removeTrainee(int traineeId);

	Trainee getTraineeById(int traineeId);

	List<Trainee> getAllTrainees();
}
