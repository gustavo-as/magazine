package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.OrderItem;
import br.com.gustavosimoes.magazine.repository.OrderItemRepository;
import br.com.gustavosimoes.magazine.service.OrderItemService;
import br.com.gustavosimoes.magazine.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    protected OrderService orderService;

    @Autowired
    protected OrderItemRepository orderItemRepository;


    @Override
    @Transactional
    public OrderItem save(OrderItem entity) {
        return orderItemRepository.save(entity);
    }

    @Override
    public OrderItem findById(Long id) {
        return orderItemRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        orderItemRepository.deleteById(id);
    }

    @Override
    public List<OrderItem> findAll() {
        return (List<OrderItem>) orderItemRepository.findAll();
    }

    @Override
    public List<OrderItem> save(Long idOrder, List<OrderItem> orderItems) {
        Order order = orderService.findById(idOrder);

        order.addItems(orderItems);

        return orderService.save(order).getItems();
    }

    @Override
    public void refundOrderItem(Long id) {
        this.delete(id);
    }
}
