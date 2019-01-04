package jovan.jakimovski.mypetclinic.services;

import jovan.jakimovski.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
