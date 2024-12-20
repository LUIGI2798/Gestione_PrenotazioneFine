package it.epicode.Gestione_Prenotazione.runner;

import it.epicode.Gestione_Prenotazione.edificio.Edificio;
import it.epicode.Gestione_Prenotazione.edificio.EdificioRepository;
import it.epicode.Gestione_Prenotazione.postazione.Postazione;
import it.epicode.Gestione_Prenotazione.postazione.PostazioneRepository;
import it.epicode.Gestione_Prenotazione.postazione.PostazioneTipo;
import it.epicode.Gestione_Prenotazione.utente.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private EdificioRepository edificioRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Edificio edificio = new Edificio();
        edificio.setNome("Edificio 4");
        edificio.setIndirizzo("Via miliscola 1");
        edificio.setCitta("Bacoli");
        edificioRepository.save(edificio);

        Postazione postazione = new Postazione();
        postazione.setCodice("P002");
        postazione.setDescrizione("Postazione privata");
        postazione.setTipo(PostazioneTipo .PRIVATO);
        postazione.setMaxOccupanti(2);
        postazione.setEdificio(edificio);
        postazioneRepository.save(postazione);
    }
}