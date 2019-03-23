package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Rosja", new BigDecimal("3333333333333333")));
        europeCountries.add(new Country("Niemcy", new BigDecimal("3333333333333333")));
        europeCountries.add(new Country("Litwa", new BigDecimal("3333333333333333")));

        List<Country> afrikaCountrires = new ArrayList<>();
        afrikaCountrires.add(new Country("Aburanda", new BigDecimal("3333333333333333")));
        afrikaCountrires.add(new Country("Mahagala", new BigDecimal("3333333333333333")));
        afrikaCountrires.add(new Country("Uganda", new BigDecimal("3333333333333333")));

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Chiny", new BigDecimal("3333333333333333")));
        asiaCountries.add(new Country("Indie", new BigDecimal("3333333333333333")));
        asiaCountries.add(new Country("Mongolia", new BigDecimal("3333333333333333")));

        //When
        Continent europe = new Continent("Europa", europeCountries);
        Continent afrika = new Continent("Afryka", afrikaCountrires);
        Continent asia = new Continent("Azja", asiaCountries);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(afrika);
        world.addContinent(asia);

        //Then
        BigDecimal expectedPeople = new BigDecimal("566868688787866866");
        Assert.assertEquals(expectedPeople, world.getPeopleQuantity());
    }
}