package com.inventivum.h2requestmatchers.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Hello", description = "Simple endpoint")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @Operation(summary = "Say hello", tags = { "Hello" })
    @ResponseStatus(HttpStatus.OK)
    public String Hello() {
        return "Hello";
    }


}
