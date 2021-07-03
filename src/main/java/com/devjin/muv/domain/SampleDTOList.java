package com.devjin.muv.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SampleDTOList {
    private List<SampleDTO> dto;

    public SampleDTOList() {
        dto = new ArrayList<>();
    }
}
