package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.generic.GenericModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
public class OrderItem extends GenericModel {

    private static final long serialVersionUID = 508722451400537588L;

    private String description;
    private BigDecimal unitPrice;
    private BigDecimal quantity;
}
