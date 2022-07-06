package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getListCars(int quantity);
    List<Car> getListCars();
    void saveCar(Car car);
    void saveCar(String series, String model, int serialNumber);
    void deleteCar(int id);
}
