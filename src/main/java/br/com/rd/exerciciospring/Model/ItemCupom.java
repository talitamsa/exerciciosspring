package br.com.rd.exerciciospring.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cupom_item")
@Entity
public class ItemCupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCupomItem")
    private Long idCupomItem;

    @ManyToOne
    @Column(name = "idCupom")
    private Long idCupom;

    @ManyToOne
    @Column(name = "idProduto")
    private Long idProduto;

    @Column(name = "qtProduto")
    private Long qtProduto;

    @Column(name = "vlProduto")
    private BigDecimal vlProduto;


}
