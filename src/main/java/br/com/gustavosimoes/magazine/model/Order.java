package br.com.gustavosimoes.magazine.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String address;

}
