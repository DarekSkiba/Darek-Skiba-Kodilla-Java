package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private BigDecimal people;
    private final String countryName;

    public Country(final String countryName, BigDecimal people) {
        this.people = people;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return people;
    }
}
