package it.epicode.Gestione_Prenotazione.prenotazione;

import it.epicode.Gestione_Prenotazione.postazione.Postazione;
import it.epicode.Gestione_Prenotazione.utente.Utente;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private Postazione postazione;

    @ManyToOne
    private Utente utente;

    private LocalDate dataPrenotazione;
}