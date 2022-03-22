package com.springcloud.eurekaclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class Produtc {
    private String description;
    private BigDecimal price;
}
