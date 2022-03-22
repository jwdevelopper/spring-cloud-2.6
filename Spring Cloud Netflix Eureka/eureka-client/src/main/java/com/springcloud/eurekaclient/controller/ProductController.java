package com.springcloud.eurekaclient.controller;

import com.springcloud.eurekaclient.dto.Produtc;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<Produtc> getProduct(){
        var p = new Produtc("Description", new BigDecimal(12.99));
        return ResponseEntity.ok().body(p);
    }
}
