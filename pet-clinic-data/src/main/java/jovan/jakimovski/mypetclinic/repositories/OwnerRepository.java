package jovan.jakimovski.mypetclinic.repositories;

import jovan.jakimovski.mypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
