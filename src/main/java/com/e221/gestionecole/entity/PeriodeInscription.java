package com.e221.gestionecole.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "periode_inscription")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeriodeInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "date_debut", nullable = false)
    private Date dateDebut;
    @Column(name = "date_fin", nullable = false)
    private Date dateFin;
    @OneToOne
    @JoinColumn(name = "inscription_id")
    private Inscription inscription;
}
