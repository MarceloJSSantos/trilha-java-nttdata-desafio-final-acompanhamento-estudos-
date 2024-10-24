package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.models;

import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.dtos.TrilhaCadastroDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Table(name = "trilhas")
@Entity(name = "Trilha")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Trilha {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Modulo> modulos;

    public Trilha(TrilhaCadastroDto trilhaCadastroDto) {
        this.titulo = trilhaCadastroDto.titulo();
        this.descricao = trilhaCadastroDto.descricao();
        this.modulos = trilhaCadastroDto.modulos().stream().map(Modulo::new).toList();
    }
}
