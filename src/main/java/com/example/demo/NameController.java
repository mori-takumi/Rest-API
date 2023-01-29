package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class NameController {
    @GetMapping("/names")
    public List<String> getNames() {
        return List.of("mori", "takahasi");

    }
}


