package jovan.jakimovski.mypetclinic.model;

import java.io.Serializable;

public class BaseEnitity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
