package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Лада", "12345", 106));
        cars.add(new Car("Мазда", "19521", 200));
        cars.add(new Car("Ниссан", "00000", 300));
        cars.add(new Car("Форд", "у21фк2", 312));
        cars.add(new Car("Лошадь", "", 1));
    }

    @Override
    public List<Car> getListCars(int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public int getCarCount() {
        return cars.size();
    }

}
