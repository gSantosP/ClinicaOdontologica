package com.example.ClinicaOdontologica.repository;

import com.example.ClinicaOdontologica.model.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista, Long> {
}
