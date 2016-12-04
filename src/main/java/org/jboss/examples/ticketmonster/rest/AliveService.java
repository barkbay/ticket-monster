package org.jboss.examples.ticketmonster.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Michael Morello
 */
@Path("/alive")
/**
 * <p>
 *     Just tell Kubernetes that we are alive
 * </p>
 */
@Stateless
public class AliveService {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response alive() {
        return Response.ok("pong").build();
    }
}
