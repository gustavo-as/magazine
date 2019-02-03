package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.OrderItem;
import br.com.gustavosimoes.magazine.service.OrderItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderItems")
public class OrderItemControl {

    private static final Logger log = LoggerFactory.getLogger(OrderItemControl.class);

    @Autowired
    OrderItemService orderItemService;

    @PostMapping("/{idOrder}")
    public List<OrderItem> post(@PathVariable Long idOrder, @RequestBody List<OrderItem> orderItems) throws Exception {
        return orderItemService.save(idOrder, orderItems);
    }

    @DeleteMapping("/{id}/refund")
    public void refundOrderItem(@PathVariable Long id) {
        orderItemService.refundOrderItem(id);
    }

}
