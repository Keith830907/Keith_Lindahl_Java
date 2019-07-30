package com.company.coffeeinventoryjdbctemplatedao.dao;

import com.company.coffeeinventoryjdbctemplatedao.model.Coffee;

import java.util.List;

public interface CoffeeDao {

    Coffee getCoffee(int id);

    List<Coffee> getAllCoffees();

    Coffee addCoffee(Coffee coffee);

    void updateCoffee(Coffee coffee);

    void deleteCoffee(int id);

    List<Coffee> getCoffeesByRoaster(int roaster_id);

    List<Coffee> getCoffeesByType(String type);
}

