package com.ing.mercatus.tixclient.program;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "program", url = "${feign.url}")
public interface ProgramClient {

    @GetMapping(value = "/composer/programs/{id}", produces = "application/json")
    ProgramDTO retrieve(@PathVariable("id") String id);

    @GetMapping(value = "/composer/programs/", produces = "application/json")
    List<ProgramDTO> retrieveAll();
}
