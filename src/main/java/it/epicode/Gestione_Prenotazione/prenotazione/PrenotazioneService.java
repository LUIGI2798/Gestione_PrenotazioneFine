package it.epicode.Gestione_Prenotazione.prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository repository;

    public List<Prenotazione> findAll() {
        return repository.findAll();
    }

    public Prenotazione save(Prenotazione prenotazione) {
        return repository.save(prenotazione);
    }
}