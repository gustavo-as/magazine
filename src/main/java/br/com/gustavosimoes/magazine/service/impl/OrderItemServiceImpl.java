package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.exception.ServiceException;
import br.com.gustavosimoes.magazine.model.OrderItem;
import br.com.gustavosimoes.magazine.repository.OrderItemRepository;
import br.com.gustavosimoes.magazine.repository.OrderRepository;
import br.com.gustavosimoes.magazine.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    protected OrderRepository orderRepository;

    @Autowired
    protected OrderItemRepository orderItemRepository;


    @Override
    @Transactional
    public OrderItem save(OrderItem entity) {
        return null;
    }

    @Override
    public OrderItem findById(Long id) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public void save(List<OrderItem> entities) {

    }

    @Override
    public List<OrderItem> findByIds(List<Long> ids) {
        return null;
    }

    @Override
    public List<OrderItem> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void delete(List<Long> ids) {

    }

    @Override
    public List<OrderItem> save(Long idOrder, List<OrderItem> orderItems) throws Exception {
        orderItems.forEach(orderItem -> {
            orderItem.setOrder(orderRepository.findById(idOrder).get());
        });
        return (List<OrderItem>) orderItemRepository.saveAll(orderItems);
    }
}
