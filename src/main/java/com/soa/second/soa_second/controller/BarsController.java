package com.soa.second.soa_second.controller;

import com.soa.second.soa_second.dto.LabWorkDto;
import com.soa.second.soa_second.service.BarsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RestController
@Path("/bars")
@Produces(MediaType.APPLICATION_JSON)
@AllArgsConstructor
public class BarsController {
    private BarsService barsService;

    @PUT
    @Path("/labwork/{labwork-id}/difficulty/increase/{steps-count}")
    public LabWorkDto increaseStepsCount(@PathParam("labwork-id") Integer id, @PathParam("steps-count") Integer stepsCount) {
        return barsService.increaseStepsCount(id, stepsCount);
    }
}
