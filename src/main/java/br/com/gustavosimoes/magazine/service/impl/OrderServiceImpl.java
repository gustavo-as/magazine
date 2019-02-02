package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.Order;
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
    public Order findById(Long id) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public void save(List<Order> entities) {

    }

    @Override
    public List<Order> findByIds(List<Long> ids) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void delete(List<Long> ids) {

    }
}
