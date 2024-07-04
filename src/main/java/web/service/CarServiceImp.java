package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> carList() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1, "BMW", "red"));
        cars.add(new Car(2, "Honda", "yellow"));
        cars.add(new Car(3, "Audi", "green"));
        cars.add(new Car(4, "Ford", "blue"));
        cars.add(new Car(5, "Mercedes", "black"));
        return cars;
    }

    @Override
    public List<Car> showCars(Integer count) {
        if (count == null || count >= carList().size()) {
            return carList();
        }
        return carList().stream().limit(count).collect(Collectors.toList());
    }
}
