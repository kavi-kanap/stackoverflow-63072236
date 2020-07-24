package pl.playground.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.playground.service.HeatingService;

@Component
public class Building {

    private HeatingService service;

    private Long buildingSize;

    @Autowired
    public Building(HeatingService service) {
        this.service = service;
    }

    public Double monthlyHeatingCost() {
        return service.getMonthlyHeatingCost(1l);
    }

    public void setBuildingSize(Long buildingSize) {
        this.buildingSize = buildingSize;
    }
}
