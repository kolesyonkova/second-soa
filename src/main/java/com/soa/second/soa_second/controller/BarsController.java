package com.soa.second.soa_second.controller;

import com.soa.second.soa_second.dto.LabWorkDto;
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
            return Response.status(e.status() == -1 ? Response.Status.SERVICE_UNAVAILABLE.getStatusCode() : e.status())
                    .entity(e.contentUTF8()).build();
        }
    }
}
