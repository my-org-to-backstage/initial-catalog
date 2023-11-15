package org.acme;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class Entrada {

    @Min(0)
    public Integer valor;
    
    @Size(min = 1, max = 32)
    public String chave;
}
