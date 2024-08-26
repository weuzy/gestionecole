package com.e221.gestionecole.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "inscriptions")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "date_inscription", nullable = false)
    private Date dateInscription;
    @Column(name = "annee_scolaire", nullable = false)
    private String anneeScolaire;
    @Column(name = "status", nullable = false)
    private EtatInscriptionEnum status;
    @ManyToOne(cascade = {CascadeType.ALL}) 
    @JoinColumn(name = "classe_id")
    private Classe classe;
    @OneToMany(mappedBy = "inscription")
    private List<Etudiant> etudiant;
    @OneToOne(mappedBy = "inscription")
    private PeriodeInscription periodeInscription;
}