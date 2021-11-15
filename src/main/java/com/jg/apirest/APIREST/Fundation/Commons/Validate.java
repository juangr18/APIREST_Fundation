package com.jg.apirest.APIREST.Fundation.Commons;

import java.util.Optional;

public class Validate {
    public void validate(Object optional){
        if(optional==null){
            throw new IllegalArgumentException("El dato ingresado se encuentra vacio.");
        }
    }
}
