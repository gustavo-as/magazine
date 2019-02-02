package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.model.enumerator.EnumOrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

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

}
