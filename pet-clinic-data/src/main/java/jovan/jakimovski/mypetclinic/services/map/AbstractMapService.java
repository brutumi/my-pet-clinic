package jovan.jakimovski.mypetclinic.services.map;
import jovan.jakimovski.mypetclinic.model.BaseEnitity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEnitity, ID extends Long>{

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());  //mesti id
            }

            map.put(object.getId(), object);
        } else{
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){

        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) { // if there is no elements start at 1L (Long)
            nextId = 1L;
        }
        return nextId;
    }
}

