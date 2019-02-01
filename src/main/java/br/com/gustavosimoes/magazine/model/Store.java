package br.com.gustavosimoes.magazine.model;

import lombok.Data;

@Data
public class Store {

    private String name;
    private String address;

    public Store(){}

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
