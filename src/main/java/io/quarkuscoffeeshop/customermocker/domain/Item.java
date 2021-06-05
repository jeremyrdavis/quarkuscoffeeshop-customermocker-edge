package io.quarkuscoffeeshop.customermocker.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.math.BigDecimal;

@RegisterForReflection
public enum Item {

    //Beverages
    CAPPUCCINO(BigDecimal.valueOf(3.50)), COFFEE_BLACK(BigDecimal.valueOf(2.50)), COFFEE_WITH_ROOM(BigDecimal.valueOf(2.50)), ESPRESSO(BigDecimal.valueOf(3.00)), ESPRESSO_DOUBLE(BigDecimal.valueOf(4.50)), LATTE(BigDecimal.valueOf(3.75)),

    //Food
    CAKEPOP(BigDecimal.valueOf(2.50)), CROISSANT(BigDecimal.valueOf(3.00)), MUFFIN(BigDecimal.valueOf(3.25)), CROISSANT_CHOCOLATE(BigDecimal.valueOf(3.50));

    public BigDecimal price;

    private Item(final BigDecimal price) {
        this.price = price;
    }

}
