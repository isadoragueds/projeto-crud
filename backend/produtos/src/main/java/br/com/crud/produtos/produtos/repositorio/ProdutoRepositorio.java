package br.com.anm.produtos.crud_produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.anm.produtos.crud_produtos.modelo.ProdutoModelo;

public Interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {
    
}
