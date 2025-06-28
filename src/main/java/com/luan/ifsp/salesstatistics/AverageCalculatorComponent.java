package com.luan.ifsp.salesstatistics;

import com.tavinho.ifsp.salesstatistics.SalesCalculationComponent;

import java.util.List;

public class AverageCalculatorComponent implements SalesCalculationComponent {
    @Override
    public double calculate(List<Double> sales) {
        if (sales.isEmpty()) return 0.0;
        return sales.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}