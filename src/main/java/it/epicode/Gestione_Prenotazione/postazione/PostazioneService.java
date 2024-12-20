package it.epicode.Gestione_Prenotazione.postazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository repository;

    public List<Postazione> findAll() {
        return repository.findAll();
    }

    public Postazione save(Postazione postazione) {
        return repository.save(postazione);
    }
}
