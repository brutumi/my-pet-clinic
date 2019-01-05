package jovan.jakimovski.mypetclinic.services.map;

import jovan.jakimovski.mypetclinic.model.Owner;
import jovan.jakimovski.mypetclinic.services.OwnerService;

import java.util.Set;

//implements CrudService - po default because that's where the crud methods definitions are... and we are just inheriting that methods from the AbstractMapService
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
