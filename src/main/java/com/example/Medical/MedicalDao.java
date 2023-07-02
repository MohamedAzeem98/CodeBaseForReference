package com.example.Medical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MedicalDao {
@Autowired MedicalRepository mr;
	public MedicalVaccination addingUp(List<MedicalVaccination> mv) {
		// TODO Auto-generated method stub
		
		mr.saveAll(mv);
		return null;
	}

}
