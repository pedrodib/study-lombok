package dev.pedrodib.study.lombok.controller;

import dev.pedrodib.study.lombok.model.ClienteModel;
import dev.pedrodib.study.lombok.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@AllArgsConstructor
public class ClienteController {

    private final ClienteRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ClienteModel>> listarTodos() {
        return ResponseEntity.ok(this.repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel clienteModel) {
        return new ResponseEntity<>(this.repository.save(clienteModel), HttpStatus.CREATED);
    }
}
