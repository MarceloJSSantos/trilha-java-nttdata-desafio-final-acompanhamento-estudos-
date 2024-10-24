package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record ModuloCadastroDto(
        @NotBlank
        String titulo,
        @NotBlank
        String descricao,
        @Valid
        List<RecursoCadastroDto> recursos) {

}
