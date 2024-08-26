package com.e221.gestionecole.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.e221.gestionecole.dto.FiliereRequest;
import com.e221.gestionecole.entity.Filiere;
import com.e221.gestionecole.exception.ApiNotFoundException;
import com.e221.gestionecole.service.FiliereService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value ="/api/gestion-ecole/filieres")
public class FiliereController {
    @Autowired
    private FiliereService service;

    @PostMapping("/create")
    public ResponseEntity<Filiere> addFiliere(@RequestBody @Valid FiliereRequest request) {
            Filiere addFiliere = service.createFiliere(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(addFiliere);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Filiere>> getAllFilieres() {
        return ResponseEntity.ok(service.getFilieres());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Filiere> getFiliereById(@PathVariable Long id) throws ApiNotFoundException {
        return ResponseEntity.ok(service.getFiliere(id));
    }
}
