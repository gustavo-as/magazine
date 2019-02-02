package br.com.gustavosimoes.magazine.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 2359929966451684036L;

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private BigDecimal unitPrice;
    private BigDecimal quantity;

    @ManyToOne(optional = false)
    private Order order;
}
