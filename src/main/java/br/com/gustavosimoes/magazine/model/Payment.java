package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.model.enumerator.EnumStatusPayment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
public class Payment implements Serializable {
    private static final long serialVersionUID = -4689257200138737293L;

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private EnumStatusPayment status;
    private String creditCardNumber;
    private LocalDateTime paymentDate = LocalDateTime.now();

    @JsonIgnore
    @OneToOne(optional = false)
    private Order order;
}
