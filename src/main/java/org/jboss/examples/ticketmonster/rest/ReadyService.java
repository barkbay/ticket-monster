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
@Path("/ready")
/**
 * <p>
 *     Just tell Kubernetes that we are ready to server
 * </p>
 */
@Stateless
public class ReadyService {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ready() {
        return Response.ok("ready").build();
    }
}
