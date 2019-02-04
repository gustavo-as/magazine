package br.com.gustavosimoes.magazine.enumerator;

import br.com.gustavosimoes.magazine.generic.IEnum;

public enum EnumOrderStatus implements IEnum {

    PENDING("Pending"),
    REFUNDED("Refunded");

    private final String description;

    EnumOrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
