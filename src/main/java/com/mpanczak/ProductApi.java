package com.mpanczak;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductApi {


    @RequestMapping(value = "", method = RequestMethod.GET)
//    @GetMapping()
    public String getProduct() {
        return "Hello GET";
    }

    @PostMapping("/products")
    public String addProduct() {
        return "Hello POST";
    }

    @PutMapping
    public String putProduct() {
        return "Hello PUT";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "Hello DELETE";
    }
}
