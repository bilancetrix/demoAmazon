package com.fiap.demo.controller;

import com.fiap.demo.entity.Desejo;
import com.fiap.demo.entity.Produto;

import com.fiap.demo.service.DesejoService;
import com.fiap.demo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Método controlador das API's do sistema.
 */
@RestController
@RequestMapping("/api/produto/v1")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @Autowired
    DesejoService desejoService;

    @GetMapping(value="/id/{id}",produces = {"application/json","application/xml"})
    public Produto findById(@PathVariable("id") Long id)  {return produtoService.findById(id);}

    @GetMapping(produces = {"application/json","application/xml"})
    public List<Produto> findALl() {return produtoService.findAll();}

    @GetMapping(value="/keyword/{keyword}",produces = {"application/json","application/xml"})
    public List <Produto> findByKeyword(@PathVariable("keyword") String keyword)  {return produtoService.findByKeyword(keyword);}

    @GetMapping(value="/category/{category}",produces = {"application/json","application/xml"})
    public List <Produto> findByCategory(@PathVariable("category") String category)  {return produtoService.findByCategory(category);}

    @PostMapping(value="/lista/{id}",produces = {"application/json","application/json"})
    public List <Produto>  postListaDesejo(@PathVariable("id") Long id)  {return desejoService.includeDesejo(id);}
}
