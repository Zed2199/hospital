package com.example.hospital.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.telmoudy.hospital.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    Page<Doctor> findByLastNameContainsIgnoreCase(String name, Pageable pageable);
}
