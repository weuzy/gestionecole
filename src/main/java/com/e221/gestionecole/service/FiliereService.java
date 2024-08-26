package com.e221.gestionecole.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e221.gestionecole.dto.FiliereRequest;
import com.e221.gestionecole.entity.Filiere;
import com.e221.gestionecole.exception.ApiNotFoundException;
import com.e221.gestionecole.repository.FiliereRepository;

@Service
public class FiliereService {
    @Autowired
    private FiliereRepository filiereRepository;

     public Filiere createFiliere(FiliereRequest  request) {
        Filiere f = new Filiere();
        f.setLibelle(request.getLibelle());
        return filiereRepository.save(f);
    }

    public List<Filiere> getFilieres() {
        return filiereRepository.findAll();
    }

    public Filiere getFiliere(Long id) throws ApiNotFoundException{
        Filiere existingFiliere = filiereRepository.findById(id).orElseThrow(() -> new ApiNotFoundException("Filiere non trouvée"));
        if (existingFiliere != null) {
            return existingFiliere;
        } else {
            throw new ApiNotFoundException("Filiere non trouvée");
        }
    }
}
