/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import com.sun.swing.internal.plaf.metal.resources.metal;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Mathias
 */
@Path("data")
public class APIResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of APIResource
     */
    public APIResource() {
    }

    /**
     * Retrieves representation of an instance of API.APIResource
     * @return an instance of java.lang.String
     */
    @Path("{amount}/{startID}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getData(@PathParam("amount")int amount, @PathParam("startID") int startID){
        return Main.generate(amount, startID);
    }

    /**
     * PUT method for updating or creating an instance of APIResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putXml(String content) {
    }
}
