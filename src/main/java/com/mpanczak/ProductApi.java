package com.mpanczak;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductApi {


//    PARAM
//    @GetMapping()
//    public String getProduct(@RequestParam String name,
//                             @RequestParam(required = false, defaultValue = "") String surname) {
//        return "Hello " + name + " " + surname;
//    }

//    PATH
//    @GetMapping("/{name}/{surname}")
//    public String getProduct(@PathVariable String name,
//                             @PathVariable String surname) {
//        return "Hello " + name + " " + surname;
//    }

//    HEADER
//    @GetMapping()
//    public String getProduct(@RequestHeader String name,
//                             @RequestHeader(required = false, defaultValue = "") String surname) {
//        return "Hello " + name + " " + surname;
//    }

//    BODY
    @GetMapping()
    public String getProduct(@RequestBody String name,
                             @RequestBody(required = false) String surname) {
        return "Hello " + name + " " + surname;
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
