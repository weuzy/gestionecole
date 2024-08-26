package com.e221.gestionecole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e221.gestionecole.repository.PeriodeInscriptionRepository;

@Service
public class PeriodeInscriptionService {
    @Autowired
    private PeriodeInscriptionRepository periodeInscriptionRepository; 
}
