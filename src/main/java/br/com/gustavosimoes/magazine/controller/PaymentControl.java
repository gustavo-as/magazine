package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.Payment;
import br.com.gustavosimoes.magazine.model.Store;
import br.com.gustavosimoes.magazine.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentControl {

    private static final Logger log = LoggerFactory.getLogger(PaymentControl.class);

    @Autowired
    PaymentService paymentService;

    @PostMapping("/{idOrder}")
    public Payment post(@PathVariable Long idOrder, @RequestBody Payment payment){
        return paymentService.save(idOrder, payment);
    }

}
