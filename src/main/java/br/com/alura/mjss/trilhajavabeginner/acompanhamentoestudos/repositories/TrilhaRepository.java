package br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.repositories;

import br.com.alura.mjss.trilhajavabeginner.acompanhamentoestudos.models.Trilha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrilhaRepository extends JpaRepository<Trilha, Long> {
}