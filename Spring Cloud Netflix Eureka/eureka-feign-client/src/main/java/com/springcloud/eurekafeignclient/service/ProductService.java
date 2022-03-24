package com.springcloud.eurekafeignclient.service;

import com.springcloud.eurekafeignclient.dto.Product;
import com.springcloud.eurekafeignclient.external.ProductClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductClient productClient;

    public List<Product> listProducts() {
        System.out.println("Chamou");
        List<Product> result = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            Product product = productClient.product().getBody();
            assert product != null;
            product.setPriceStore(product.getPrice().multiply(new BigDecimal(2)));
            result.add(product);
        }
        return result;
    }
}
