package com.cg.trainee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainees")
public class Trainee {
	@Id
	@GeneratedValue//1  ++1
	@Column(length = 10)
	private int traineeId;
	@Column(length = 10)
	private String traineeName;
	@Column(length = 20)
	private String traineeBatch;

	public Trainee(int traineeId, String traineeName, String traineeBatch) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeBatch = traineeBatch;
	}
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeBatch() {
		return traineeBatch;
	}

	public void setTraineeBatch(String traineeBatch) {
		this.traineeBatch = traineeBatch;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeBatch=" + traineeBatch
				+ "]";
	}

	public Trainee( String traineeName, String traineeBatch) {
		super();
		this.traineeName = traineeName;
		this.traineeBatch = traineeBatch;
	}

}
