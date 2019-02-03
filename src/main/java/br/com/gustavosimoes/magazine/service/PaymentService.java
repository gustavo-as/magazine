package br.com.gustavosimoes.magazine.service;

import br.com.gustavosimoes.magazine.generic.GenericInterfaceOperations;
import br.com.gustavosimoes.magazine.model.Payment;

public interface PaymentService extends GenericInterfaceOperations<Payment> {

    Payment save(Long idOrder, Payment payment);
}
