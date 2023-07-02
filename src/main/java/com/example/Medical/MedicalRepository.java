package com.example.Medical;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRepository extends JpaRepository<MedicalVaccination,Integer> {

}
