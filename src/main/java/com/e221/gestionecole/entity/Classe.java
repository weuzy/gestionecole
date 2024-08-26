package com.e221.gestionecole.entity;

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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "classes")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "code", nullable = false)
    private String code;
    @Column(name = "libelle", nullable = false)
    private String libelle;
    @Column(name = "frais_inscription", nullable = false)
    private String fraisInscription;
    @Column(name = "mensualite", nullable = false)
    private String  mensualite;
    @Column(name = "autres_frais", nullable = false)
    private String autresFrais;
    @ManyToOne(cascade = {CascadeType.ALL}) 
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;
    @OneToMany(mappedBy = "classe")
    private List<Inscription> inscriptions;

}
