package pl.playground.service;

import org.springframework.stereotype.Component;

@Component
public class HeatingServiceImpl implements HeatingService {

    private final Double CUBIC_PRICE = 2.3;

    public HeatingServiceImpl() {}

    @Override
    public Double getMonthlyHeatingCost(Long size) {
        return size * CUBIC_PRICE;
    }
}
