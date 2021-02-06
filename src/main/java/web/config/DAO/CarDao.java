package web.config.DAO;

import web.config.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCars(List<Car> cars, int count);
}
