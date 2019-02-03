package br.com.gustavosimoes.magazine.service;

import br.com.gustavosimoes.magazine.generic.GenericInterfaceOperations;
import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.Payment;

public interface OrderService extends GenericInterfaceOperations<Order> {

    Order payOrder(Long id, Payment payment);
}
