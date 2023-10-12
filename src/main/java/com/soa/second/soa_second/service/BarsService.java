package com.soa.second.soa_second.service;

import com.soa.second.soa_second.dto.LabWorkDto;
import com.soa.second.soa_second.feign.LabWorkClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BarsService {
    private LabWorkClient labWorkClient;

    public LabWorkDto increaseStepsCount(Integer id, Integer stepsCount) {
        return labWorkClient.increaseStepsCount(id, stepsCount);
    }

    public List<LabWorkDto> makeHardcore(Integer id) {
        return labWorkClient.makeHardcore(id);
    }
}
