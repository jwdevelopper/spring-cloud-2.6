package com.springcloud.eurekafeignclient.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Builder
@Getter
@Setter
public class Product {
    private String description;
    private BigDecimal price;
    private BigDecimal priceStore;
}
