package dev.pedrodib.study.lombok.controller;

import dev.pedrodib.study.lombok.model.ClienteModel;
import dev.pedrodib.study.lombok.model.ProdutoModel;
import dev.pedrodib.study.lombok.repository.ClienteRepository;
import dev.pedrodib.study.lombok.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor
public class ProdutoController {
    private final ProdutoRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ProdutoModel>> listarTodos() {
        return ResponseEntity.ok(this.repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produtoModel) {
        return new ResponseEntity<>(this.repository.save(produtoModel), HttpStatus.CREATED);
    }
}
