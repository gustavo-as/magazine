package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.Payment;
import br.com.gustavosimoes.magazine.repository.PaymentRepository;
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

    @Autowired
    protected PaymentRepository paymentRepository;

    @Override
    @Transactional
    public Payment save(Payment entity) {
        return paymentRepository.save(entity);
    }

    @Override
    public Payment findById(Long id) {
        return paymentRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public List<Payment> findAll() {
        return (List<Payment>) paymentRepository.findAll();
    }

}
