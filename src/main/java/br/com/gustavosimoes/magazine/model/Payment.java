package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.generic.GenericModel;
import br.com.gustavosimoes.magazine.enumerator.EnumStatusPayment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Payment extends GenericModel {

    private static final long serialVersionUID = -4932533674481331662L;

    @Enumerated(EnumType.STRING)
    private EnumStatusPayment status;
    private String creditCardNumber;
    private LocalDateTime paymentDate = LocalDateTime.now();

}
