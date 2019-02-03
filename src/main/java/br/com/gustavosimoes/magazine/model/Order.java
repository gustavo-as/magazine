package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.model.enumerator.EnumOrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private String address;
    private LocalDateTime confirmationDate;

    @Enumerated(EnumType.STRING)
    private EnumOrderStatus status;

    @ManyToOne(optional = false)
    private Store store = new Store();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Set<OrderItem> items = new HashSet<OrderItem>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Payment payment;


}
