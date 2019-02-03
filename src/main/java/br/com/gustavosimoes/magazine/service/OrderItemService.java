package br.com.gustavosimoes.magazine.service;

import br.com.gustavosimoes.magazine.generic.GenericInterfaceOperations;
import br.com.gustavosimoes.magazine.model.OrderItem;

import java.util.List;

public interface OrderItemService extends GenericInterfaceOperations<OrderItem> {

    List<OrderItem> save(Long idOrder, List<OrderItem> orderItems);

}
