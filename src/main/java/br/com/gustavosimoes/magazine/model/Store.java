package br.com.gustavosimoes.magazine.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Store {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    public Store() {}

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
