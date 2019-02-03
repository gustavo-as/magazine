package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.Payment;
import br.com.gustavosimoes.magazine.service.OrderService;
import br.com.gustavosimoes.magazine.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    protected OrderService orderService;

    @Override
    @Transactional
    public Payment save(Payment entity) {
        return null;
    }

    @Override
    public Payment findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public void save(List<Payment> entities) {

    }

    @Override
    public List<Payment> findByIds(List<Long> ids) {
        return null;
    }

    @Override
    public List<Payment> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void delete(List<Long> ids) {

    }

    @Override
    public Payment save(Long idOrder, Payment payment) {
        orderService.findById(idOrder);
        return null;
    }
}
