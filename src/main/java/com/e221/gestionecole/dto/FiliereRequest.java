package com.e221.gestionecole.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiliereRequest {
    @NotBlank(message = "Le libelle est obligatoire")
    @NotNull(message = "Le libelle de la catégorie du produit ne peut pas être null")
    private String libelle;
}
