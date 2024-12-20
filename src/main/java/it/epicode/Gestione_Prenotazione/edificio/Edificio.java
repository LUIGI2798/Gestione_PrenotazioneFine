package it.epicode.Gestione_Prenotazione.edificio;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data


public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String indirizzo;
    private String citta;
}
