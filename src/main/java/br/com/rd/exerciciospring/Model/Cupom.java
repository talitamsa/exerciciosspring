package br.com.rd.exerciciospring.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_cupom")
@Entity
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCupom")
    private Long idCupom;

    @Column(name = "idCliente")
    private Long idCliente;

    @Column(name = "dt_venda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVenda;

    @Column(name = "vlVenda")
    private BigDecimal vlVenda;

}
