package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Make1", "Model1", "color1"));
        cars.add(new Car("Make2", "Model2", "color2"));
        cars.add(new Car("Make3", "Model3", "color3"));
        cars.add(new Car("Make4", "Model4", "color4"));
        cars.add(new Car("Make5", "Model5", "color5"));
    }
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
