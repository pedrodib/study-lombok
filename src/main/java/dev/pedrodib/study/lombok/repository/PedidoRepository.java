package dev.pedrodib.study.lombok.repository;

import dev.pedrodib.study.lombok.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, String> {

}
