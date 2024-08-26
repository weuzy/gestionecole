package com.e221.gestionecole.dto;

import com.e221.gestionecole.entity.Filiere;
import com.e221.gestionecole.validation.ValidEntity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClasseRequest {
    @NotBlank(message = "Le code est obligatoire")
    @NotNull(message = "Le code de la classe ne peut pas être null")
    private String code;
    @NotBlank(message = "Le libelle est obligatoire")
    @NotNull(message = "Le libelle de la classe ne peut pas être null")
    private String libelle;
    @NotBlank(message = "Les frais d'inscription est obligatoire")
    @NotNull(message = "Les frais d'inscription de la classe ne peut pas être null")
    private String fraisInscription;
    @NotBlank(message = "Les autres frais est obligatoire")
    @NotNull(message = "Les autres frais de la classe ne peut pas être null")
    private String autresFrais;
    @ValidEntity(message = "La filiere de la classe est invalide", type = Filiere.class)
    private Filiere filiere;
}
