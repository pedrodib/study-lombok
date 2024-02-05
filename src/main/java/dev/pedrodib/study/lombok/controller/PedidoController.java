package dev.pedrodib.study.lombok.controller;

import dev.pedrodib.study.lombok.model.PedidoModel;
import dev.pedrodib.study.lombok.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
@AllArgsConstructor
public class PedidoController {

    private final PedidoRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<PedidoModel>> listarTodos() {
        return ResponseEntity.ok(this.repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<PedidoModel> salvar(@RequestBody PedidoModel pedido) {

        return new ResponseEntity<>(this.repository.save(pedido), HttpStatus.CREATED);
    }
}
