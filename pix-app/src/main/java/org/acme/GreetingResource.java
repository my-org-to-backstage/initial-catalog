package org.acme;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pix")
public class GreetingResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void efetuarPagamento(Entrada e) {
    }
}
