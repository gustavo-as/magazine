package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.Payment;
import br.com.gustavosimoes.magazine.enumerator.EnumOrderStatus;
import br.com.gustavosimoes.magazine.repository.OrderRepository;
import br.com.gustavosimoes.magazine.repository.StoreRepository;
import br.com.gustavosimoes.magazine.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    protected StoreRepository storeRepository;

    @Autowired
    protected OrderRepository orderRepository;


    @Override
    @Transactional
    public Order save(Order entity) {
        entity.setStore(storeRepository.findById(entity.getStore().getId()).get());
        return orderRepository.save(entity);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    public List<Order> findAll() {
        Iterable<Order> orders = orderRepository.findAll();
        return (List<Order>) orders;
    }

    @Override
    @Transactional
    public Order payOrder(Long id, Payment payment) {
        Order order = this.findById(id);
        order.setPayment(payment);
        orderRepository.save(order);
        return order;
    }

    @Override
    public List<Order> getAllOrderPaid() {
        List<Order> orders = orderRepository.findAllByPaymentIsNotNull();
        return orders;
    }

    @Override
    public void refund(Long id) {
        orderRepository.findById(id).map(order -> {
            order.setStatus(EnumOrderStatus.REFUNDED);
            return orderRepository.save(order);
        });

    }
}
