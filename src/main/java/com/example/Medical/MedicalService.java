package com.example.Medical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MedicalService {
@Autowired MedicalDao md;
	public MedicalVaccination addingUp(List<MedicalVaccination> mv) {
		// TODO Auto-generated method stub
		return md.addingUp(mv);
	}

}
