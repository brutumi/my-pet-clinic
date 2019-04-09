package jovan.jakimovski.mypetclinic.repositories;

import jovan.jakimovski.mypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
