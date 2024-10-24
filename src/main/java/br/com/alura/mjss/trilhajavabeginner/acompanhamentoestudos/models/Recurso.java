package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.models;

import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.dtos.RecursoCadastroDto;
import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.enums.TipoRecurso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "recursos")
@Entity(name = "Recurso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Recurso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoRecurso tipo;
    private String conteudo;

    public Recurso(RecursoCadastroDto recursoCadastroDto) {
        this.tipo = recursoCadastroDto.tipo();
        this.conteudo = recursoCadastroDto.conteudo();
    }
}
