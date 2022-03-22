package com.springcloud.eurekafeignclient.controller;

import com.springcloud.eurekafeignclient.dto.Product;
import com.springcloud.eurekafeignclient.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("feignProduct")
@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<Product> products(){
        return service.listProducts();
    }
}
