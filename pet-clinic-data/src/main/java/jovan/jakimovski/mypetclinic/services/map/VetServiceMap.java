package jovan.jakimovski.mypetclinic.services.map;

import jovan.jakimovski.mypetclinic.model.Vet;
import jovan.jakimovski.mypetclinic.services.CrudService;

import java.util.Set;

//implements CrudService - po default because that's where the crud methods definitions are... and we are just inheriting that methods from the AbstractMapService
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
