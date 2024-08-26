package com.e221.gestionecole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e221.gestionecole.repository.InscriptionRepository;

@Service
public class InscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepository;
}
