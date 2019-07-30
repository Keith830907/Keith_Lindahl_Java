package com.company.motoinventoryjdbctemplatedao;

import java.util.List;

public interface MotoInventoryDAO {

    Motorcycle getMotorcycle(int id);
    List<Motorcycle> getAllMotorcycles();
    Motorcycle createMotorcycle(Motorcycle motorcycle);
    void updateMotorcycle(Motorcycle motorcycle);
    void deleteMotorcycle(int id);
    List<Motorcycle> getByMake(String make);

}
