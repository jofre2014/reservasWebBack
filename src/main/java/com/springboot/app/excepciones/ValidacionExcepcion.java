package com.springboot.app.excepciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Valeria
 */
public class ValidacionExcepcion extends Exception {
    
    private static final long serialVersionUID = -3332292346834265371L;
    
    Map<String, Set<String>> errors = new HashMap<>();
    
    public ValidacionExcepcion( Map<String, Set<String>> errors ){
        super();
        setErrors(errors);
    }

    public Map<String, Set<String>> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Set<String>> errors) {
        this.errors = errors;
    }
    
    
    
}
