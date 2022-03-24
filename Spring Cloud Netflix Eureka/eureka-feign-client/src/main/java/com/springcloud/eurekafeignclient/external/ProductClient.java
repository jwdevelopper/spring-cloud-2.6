package com.springcloud.eurekafeignclient.external;

import com.springcloud.eurekafeignclient.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cliente", path = "/products")
public interface ProductClient {
    @GetMapping
    ResponseEntity<Product> product();
}
