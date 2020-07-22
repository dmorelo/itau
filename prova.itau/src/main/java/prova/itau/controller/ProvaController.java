package prova.itau.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.bson.types.ObjectId;

import prova.itau.entity.Prova;

/**
 * Classe Teste.
 *
 * @author Dennis Morelo
 *
 */
@Path("/prova-itau")
@Consumes("application/json")
@Produces("application/json")
public class ProvaController {
    
    /**
     * Método list.
     *
     * @return List<Prova>
     */
    @GET
    public List<Prova> list() {
        return new Prova().listarProva();
    }
    
    /**
     * Método get.
     *
     * @param id String
     * @return Prova
     */
    @GET
    @Path("/{id}")
    public Prova get(@PathParam("id") String id) {
        return Prova.findById(new ObjectId(id));
    }
    
    /**
     * Método create.
     *
     * @param prova Prova
     * @return Response
     */
    @POST
    public Response create(Prova prova) {
        prova.persist();
        return Response.status(201).build();
    }

    /**
     * Método update.
     *
     * @param id String
     * @param prova Prova
     */
    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") String id, Prova prova) {
        prova.update();
    }

    /**
     * Método delete.
     *
     * @param id String
     */
    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") String id) {
        Prova prova = Prova.findById(new ObjectId(id));
        prova.delete();
    }
}