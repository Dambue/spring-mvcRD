package web.config.service;

import web.config.DAO.CarDao;
import web.config.DAO.CarDaoImpl;
import web.config.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        return carDao.getCars(cars, count);
    }
}
