package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.dtos;

import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.enums.TipoRecurso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RecursoCadastroDto(
        @NotNull
        TipoRecurso tipo,
        @NotBlank
        String conteudo) {
}
