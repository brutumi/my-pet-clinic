package jovan.jakimovski.mypetclinic.repositories;

import jovan.jakimovski.mypetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
