package com.aspect.myannotation.validatoranntation;

import com.aspect.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class Controller {

    @PostMapping("/test")
    public String get(@Valid @RequestBody Dto dto) {
        return dto.value;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
