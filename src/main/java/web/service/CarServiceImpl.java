package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getListCars(int quantity) {
        return carDao.getListCars(quantity);
    }

    @Override
    public List<Car> getListCars() {
        return carDao.getListCars();
    }

    @Override
    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    @Override
    public void saveCar(String series, String model, int serialNumber) {
        carDao.saveCar(series, model, serialNumber);
    }

    @Override
    public void deleteCar(int id) {
        carDao.deleteCar(id);
    }

}
