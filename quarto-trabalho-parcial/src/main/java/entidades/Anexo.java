package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Anexo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long codigo;
    public String nomeArquivo;
    public Long tamanhoBytes;
    public String urlArmazenamento;

    @ManyToOne
    public Conversa conversa;
}
