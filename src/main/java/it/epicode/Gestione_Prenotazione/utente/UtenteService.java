package it.epicode.Gestione_Prenotazione.utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository repository;

    public List<Utente> findAll() {
        return repository.findAll();
    }

    public Utente save(Utente utente) {
        return repository.save(utente);
    }
}