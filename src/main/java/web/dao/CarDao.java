package web.dao;

import java.util.List;

public interface CarDao<T> {
    List<T> getListCars();
    void saveCar(T car);
    void saveCar(String series, String model, int serialNumber);
    void deleteCar(int id);
}
