package br.com.rd.exerciciospring.Repository;

import br.com.rd.exerciciospring.Model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    public List<Cupom> findByIdClienteAndDtVenda(Long idCliente, Date dtVenda);

    public List<Cupom> findByDataVenda(Date dtVenda);

}
