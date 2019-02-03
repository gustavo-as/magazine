package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.generic.GenericModel;
import br.com.gustavosimoes.magazine.model.enumerator.EnumOrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order extends GenericModel {

    private static final long serialVersionUID = -569742913106311884L;

    private String address;
    private LocalDateTime confirmationDate;

    @Enumerated(EnumType.STRING)
    private EnumOrderStatus status;

    @ManyToOne(optional = false)
    private Store store = new Store();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderItem> items = new ArrayList<OrderItem>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Payment payment;

    public void addItems(List<OrderItem> orderItems) {
        this.items.addAll(orderItems);
        System.out.println();
    }
}
