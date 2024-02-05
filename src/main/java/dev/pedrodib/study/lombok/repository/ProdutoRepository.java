package dev.pedrodib.study.lombok.repository;

import dev.pedrodib.study.lombok.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
}
