package web.config.DAO;

import web.config.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }
        return carList;
    }
}
