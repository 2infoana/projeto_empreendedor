package br.com.senai.infoa.backend.projeto_empreeendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_empreeendedor.models.Endereco;

public interface EnderecoRepository  extends JpaRepository<Endereco, Integer> {
    
}
