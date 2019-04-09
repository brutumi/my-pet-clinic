package jovan.jakimovski.mypetclinic.services.map;

import jovan.jakimovski.mypetclinic.model.Owner;
import jovan.jakimovski.mypetclinic.model.Pet;
import jovan.jakimovski.mypetclinic.services.OwnerService;
import jovan.jakimovski.mypetclinic.services.PetService;
import jovan.jakimovski.mypetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

//implements CrudService - po default because that's where the crud methods definitions are... and we are just inheriting that methods from the AbstractMapService
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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

        if(object != null){
            if(object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){ //ako ima PetType
                        if(pet.getPetType().getId() == null){ // ako PetType ne e zacuvano, zacuvaj go
                            pet.setPetType(petTypeService.save(pet.getPetType())); // petType id == pet.setPetType() za update na id-to
                        }

                    } else{
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){        //pet id
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(object);

        }else{
            return null;
        }
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
