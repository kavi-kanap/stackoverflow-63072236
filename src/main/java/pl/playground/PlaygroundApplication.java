package pl.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.playground.facade.Building;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PlaygroundApplication.class);
        Building building = context.getBean(Building.class);
        building.setBuildingSize(12L);
        System.out.println(building.monthlyHeatingCost());
    }
}
