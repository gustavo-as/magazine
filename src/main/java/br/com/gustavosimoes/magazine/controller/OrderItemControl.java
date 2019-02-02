package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.Order;
import br.com.gustavosimoes.magazine.model.OrderItem;
import br.com.gustavosimoes.magazine.service.OrderItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderitems")
public class OrderItemControl {

    private static final Logger log = LoggerFactory.getLogger(OrderItemControl.class);

    @Autowired
    OrderItemService orderItemService;

    @PostMapping("/{idOrder}")
    public OrderItem post(@PathVariable Long idOrder, @RequestBody List<OrderItem> orderItems){
        return null;
    }

}
