package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListCars(int count);
    int getCarCount();
    void whichpagetoshow(int count, ModelMap model);
}