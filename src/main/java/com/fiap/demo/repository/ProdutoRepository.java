package com.fiap.demo.repository;

import com.fiap.demo.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
//            @Query(value = "SELECT * FROM tbl_produto WHERE nome LIKE '%?1%' and genre LIKE '%?1%' and details LIKE '%?1%'")
//            Produto findByKeyword(String keyword);

//        @Query("from Produto u where u.Nome like %?1")
        List <Produto> findByKeyword(String keyword);

        List <Produto> findTop3ByCategory(String category);

}

