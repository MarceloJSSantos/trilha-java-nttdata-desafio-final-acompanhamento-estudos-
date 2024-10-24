package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.models;

import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.dtos.ModuloCadastroDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "modulos")
@Entity(name = "Modulo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Modulo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Recurso> recursos;

    public Modulo(ModuloCadastroDto moduloCadastroDto) {
        this.titulo = moduloCadastroDto.titulo();
        this.descricao = moduloCadastroDto.descricao();
        this.recursos = moduloCadastroDto.recursos().stream().map(Recurso::new).toList();
    }
}
