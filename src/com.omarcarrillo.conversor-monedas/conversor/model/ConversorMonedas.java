package com.conversor.model;

import java.util.Map;

public record MonedasExchangerate(
        String result,
        String base_code,
        Map<String, Double> conversion_rates
) {
}