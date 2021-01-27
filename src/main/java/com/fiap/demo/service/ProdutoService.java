package com.fiap.demo.service;

import com.fiap.demo.entity.Produto;
import com.fiap.demo.exception.ResourceNotFoundException;
import com.fiap.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Método responsável pela comunicação da tabela tbl_produto com a API
 */
@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public List <Produto> findAll() {
        return repository.findAll();
    }

    public Produto findById(Long id) {
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));
    }

    public List <Produto> findByKeyword (String keyword) {
        return repository.findByKeyword(keyword);
    }

    public List <Produto> findByCategory (String category) {
        return repository.findTop3ByCategory(category);
    }

}
