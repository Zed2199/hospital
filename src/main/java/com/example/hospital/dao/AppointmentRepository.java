package com.example.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.telmoudy.hospital.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {


}
