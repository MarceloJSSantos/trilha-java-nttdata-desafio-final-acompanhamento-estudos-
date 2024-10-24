package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.controllers;

import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.dtos.TrilhaCadastroDto;
import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.models.Trilha;
import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.repositories.TrilhaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trilhas")
public class TrilhaController {

    @Autowired
    private TrilhaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid TrilhaCadastroDto trilhaCadastroDto){
        System.out.println(trilhaCadastroDto);
        var resposta = repository.save(new Trilha(trilhaCadastroDto));
    }
}
