package io.github.dougllasfps.application.cadastrocarro;

import io.github.dougllasfps.domain.model.Car;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/carros")
public class CadastroCarroResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response save(CadastroCarroRequest request){
        Car car = request.toModel();
        car.persist();
        return Response.ok(car.toString()).build();
    }
}
