package com.soa.second.soa_second.feign;

import com.soa.second.soa_second.dto.LabWorkDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface LabWorkClient {
    @RequestMapping(
            value = "/labworks/{id}/difficulty/increase/{steps-count}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    LabWorkDto increaseStepsCount(@PathVariable("id") Integer id, @PathVariable("steps-count") Integer stepsCount);

    @RequestMapping(
            value = "/labworks/discipline/{discipline-id}/make-hardcore",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    List<LabWorkDto> makeHardcore(@PathVariable("discipline-id") Integer id);
}
