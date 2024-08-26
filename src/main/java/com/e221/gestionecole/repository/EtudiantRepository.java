package com.e221.gestionecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e221.gestionecole.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
