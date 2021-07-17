package com.lucas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lucas.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
