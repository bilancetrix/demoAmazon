package com.fiap.demo.service;

import com.fiap.demo.entity.Desejo;
import com.fiap.demo.entity.Produto;
import com.fiap.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesejoService {

    @Autowired
    ProdutoRepository repository;

    List<Produto> produtoList;

    Produto produto;
    Desejo desejo = new Desejo();

    public List<Produto> includeDesejo(Long id) {

        produto = repository.getOne(id);
        produtoList = desejo.getProduto();
        produtoList.add(produto);
        desejo.setProduto(produtoList);
        return produtoList;
    }
}
