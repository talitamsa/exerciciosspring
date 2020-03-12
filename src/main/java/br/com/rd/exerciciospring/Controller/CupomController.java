package br.com.rd.exerciciospring.Controller;


import br.com.rd.exerciciospring.Model.Cupom;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    private CupomRepository cupomRepository;

    @PostMapping("/cupom")
    public Cupom save(@RequestBody Cupom cupom){
        return cupomRepository.save(cupom);
    }

    @GetMapping("/cupom")
    public void findByIdClienteAndDtVenda(@PathParam("idCliente") Long idCliente,
                                          @PathParam("dtVenda") Date dataVenda){

        List<Cupom> cupom = new ArrayList<>();
        if (idCliente != null && dataVenda != null)
            cupom =cupomRepository.findByIdClienteAndDtVenda(idCliente, dataVenda);
        else if (idCliente != null)
            cupom.add(cupomRepository.findById(idCliente).get());
        else if (dataVenda != null)
            cupom = cupomRepository.findByDataVenda(dataVenda);

        if (cupom != null && cupom.size()>0){
            ResponseEntity.ok().body(cupom)
        } else {
        return ResponseEntity.badRequest().build();
    }
//    }
}
