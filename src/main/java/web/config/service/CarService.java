package web.config.service;

import web.config.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars(List<Car> cars, int count);
}
