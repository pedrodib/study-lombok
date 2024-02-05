package dev.pedrodib.study.lombok.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity(name = "pedido")
@Getter @Setter
@ToString
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ClienteModel cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoItemModel> itens;

}
