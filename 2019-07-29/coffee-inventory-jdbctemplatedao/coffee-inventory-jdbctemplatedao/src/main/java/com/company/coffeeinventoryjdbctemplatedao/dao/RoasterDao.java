package com.company.coffeeinventoryjdbctemplatedao.dao;

import com.company.coffeeinventoryjdbctemplatedao.model.Roaster;

import java.util.List;

public interface RoasterDao {

    Roaster getRoaster(int id);

    List<Roaster> getAllRoasters();

    Roaster addRoaster(Roaster roaster);

    void updateRoaster(Roaster roaster);

    void deleteRoaster(int id);

}

