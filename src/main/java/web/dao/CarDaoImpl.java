package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao<Car> {

    private final List<Car> cars = new ArrayList<>(); //Цей список - імітація бази даних

    @SuppressWarnings("SpellCheckingInspection")
    public CarDaoImpl() {
        cars.add(new Car("A", "Toyota", 100500));
        cars.add(new Car("C", "Wolksvagen", 100500));
        cars.add(new Car("D", "Ford", 100500));
        cars.add(new Car("B", "Shkoda", 100500));
        cars.add(new Car("F", "Lifan", 100500));
        cars.add(new Car("Z", "Moskvich", 100500));
    }

    @Override
    public List<Car> getListCars() {
        return cars;
    }

    @Override
    public void saveCar(Car car) {
        cars.add(car);
    }

    @Override
    public void saveCar(String series, String model, int serialNumber) {
        cars.add(new Car(series, model, serialNumber));
    }

    @Override
    public void deleteCar(int id) {
        cars.remove(id);
    }
}
