package br.com.senai.infoa.backend.projeto_empreeendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_empreeendedor.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
