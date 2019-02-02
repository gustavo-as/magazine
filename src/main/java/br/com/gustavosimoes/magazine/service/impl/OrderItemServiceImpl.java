package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.OrderItem;
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
}
