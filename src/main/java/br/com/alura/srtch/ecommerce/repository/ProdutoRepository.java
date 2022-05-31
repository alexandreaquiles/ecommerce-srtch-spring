package br.com.alura.srtch.ecommerce.repository;

import br.com.alura.srtch.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
