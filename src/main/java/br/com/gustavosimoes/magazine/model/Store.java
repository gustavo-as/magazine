package br.com.gustavosimoes.magazine.model;

import br.com.gustavosimoes.magazine.generic.GenericModel;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Store extends GenericModel {

    private static final long serialVersionUID = 5874081386062225538L;

    private String name;
    private String address;

    public Store() {}

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
