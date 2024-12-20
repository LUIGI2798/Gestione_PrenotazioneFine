package it.epicode.Gestione_Prenotazione.postazione;



import it.epicode.Gestione_Prenotazione.edificio.Edificio;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String codice;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private PostazioneTipo tipo;

    private int maxOccupanti;

    @ManyToOne
    private Edificio edificio;
}
