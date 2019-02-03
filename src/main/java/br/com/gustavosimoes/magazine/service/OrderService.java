package br.com.gustavosimoes.magazine.service;

import br.com.gustavosimoes.magazine.generic.GenericInterfaceOperations;
import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.Payment;

import java.util.List;

public interface OrderService extends GenericInterfaceOperations<Order> {

    Order payOrder(Long id, Payment payment);

    List<Order> getAllOrderPaid();
}
