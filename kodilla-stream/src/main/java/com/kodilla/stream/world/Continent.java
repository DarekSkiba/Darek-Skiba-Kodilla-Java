package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continents;
    private List<Country> countries = new ArrayList<>();

    public Continent(final String continents, List<Country> countries) {
        this.continents = continents;
        this.countries = countries;

    }

    public List<Country> getCountries() {
        return countries;
    }
}