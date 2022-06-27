package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getListCars();
    List<Car> getListCars(int quantity);
    void saveCar(Car car);
    void saveCar(String series, String model, int serialNumber);
    void deleteCar(int id);
}
