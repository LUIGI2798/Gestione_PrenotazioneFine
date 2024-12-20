package it.epicode.Gestione_Prenotazione.edificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EdificioService {
    @Autowired
    private EdificioRepository repository;

    public List<Edificio> findAll() {
        return repository.findAll();
    }

    public Edificio save(Edificio edificio) {
        return repository.save(edificio);
    }
}
