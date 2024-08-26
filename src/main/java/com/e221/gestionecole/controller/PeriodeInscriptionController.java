package com.e221.gestionecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e221.gestionecole.service.PeriodeInscriptionService;

@RestController
@RequestMapping(value ="/api/gestionecole/periode-inscription")
public class PeriodeInscriptionController {
    @Autowired
    private PeriodeInscriptionService service;
}
