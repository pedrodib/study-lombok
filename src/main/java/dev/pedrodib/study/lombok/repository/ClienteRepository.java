package dev.pedrodib.study.lombok.repository;

import dev.pedrodib.study.lombok.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

}
