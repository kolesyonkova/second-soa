package com.soa.second.soa_second.controller;

import com.soa.second.soa_second.service.BarsService;
import feign.FeignException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RestController
@Path("/bars")
@Produces(MediaType.APPLICATION_JSON)
@AllArgsConstructor
public class BarsController {
    private BarsService barsService;

    @PUT
    @Path("/labwork/{labwork-id}/difficulty/increase/{steps-count}")
    public Response increaseStepsCount(@PathParam("labwork-id") Integer id, @PathParam("steps-count") Integer stepsCount) {
        try {
            return Response.ok(barsService.increaseStepsCount(id, stepsCount)).build();
        } catch (FeignException e) {
            return e.status() == -1 ? Response.status(Response.Status.GATEWAY_TIMEOUT.getStatusCode())
                    .entity("Service unavailable")
                    .build() : Response.status(e.status()).entity(e.contentUTF8()).build();
        }
    }

    @POST
    @Path("/disciplines/{discipline-id}/make-hardcore")
    public Response makeHardcore(@PathParam("discipline-id") Integer id) {
        try {
            return Response.ok(barsService.makeHardcore(id)).build();
        } catch (FeignException e) {
            return e.status() == -1 ? Response.status(Response.Status.GATEWAY_TIMEOUT.getStatusCode())
                    .entity("Service unavailable")
                    .build() : Response.status(e.status()).entity(e.contentUTF8()).build();
        }
    }
}
