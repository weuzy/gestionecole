package com.e221.gestionecole.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "etudiants")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "matricule", nullable = false)
    private String matricule;
    @Column(name = "nom", nullable = false)
    private String nom;
    @Column(name = "prenom", nullable = false)
    private String prenom;
    @Column(name = "date_naissance", nullable = false)
    private String dateNaissance;
    @Column(name = "adresse", nullable = false)
    private String adresse;
    @Column(name = "telephone", nullable = false)
    private String telephone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "status", nullable = false, columnDefinition = "int default 0")
    private boolean status;
    @Column(name = "sexe", nullable = false)
    private String sexe;
    @ManyToOne(cascade ={CascadeType.ALL})
    @JoinColumn(name = "inscription_id")
    private Inscription inscription;

}
