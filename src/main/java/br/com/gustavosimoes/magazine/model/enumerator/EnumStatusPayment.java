package br.com.gustavosimoes.magazine.model.enumerator;

import br.com.gustavosimoes.magazine.generic.IEnum;

public enum EnumStatusPayment implements IEnum {

    PURCHASING("Purchasing"), // A transação está sendo processada.
    PURCHASED("Purchased"), // Processou o pagamento com sucesso.
    FAILED("Failed"); // Pagamento

    private final String description;

    EnumStatusPayment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
