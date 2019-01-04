package jovan.jakimovski.mypetclinic.services;

import jovan.jakimovski.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
