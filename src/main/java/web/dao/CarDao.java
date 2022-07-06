package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getListCars(int count);
    List<Car> getListCars();
    void saveCar(Car car);
    void saveCar(String series, String model, int serialNumber);
    void deleteCar(int id);
}
