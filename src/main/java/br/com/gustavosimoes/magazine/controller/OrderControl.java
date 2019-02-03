package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.Payment;
import br.com.gustavosimoes.magazine.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderControl {

    private static final Logger log = LoggerFactory.getLogger(OrderControl.class);

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<Order> getAll(){
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id){
        return orderService.findById(id);
    }

    @PostMapping("/{idStore}")
    public Order post(@PathVariable Long idStore, @RequestBody Order order){
        order.getStore().setId(idStore);
        return orderService.save(order);
    }

    @PutMapping("{id}/pay")
    public Order pay(@PathVariable Long id, @RequestBody Payment payment) {
        return orderService.payOrder(id, payment);
    }

}
