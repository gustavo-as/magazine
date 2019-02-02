package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderControl {

    private static final Logger log = LoggerFactory.getLogger(OrderControl.class);

    @Autowired
    OrderService orderService;

    @PostMapping("/{idStore}")
    public Order post(@PathVariable Long idStore, @RequestBody Order order){
        order.getStore().setId(idStore);
        return orderService.save(order);
    }

}
