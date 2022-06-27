package web.model;

import org.springframework.lang.Nullable;

public class Car {
    private String series;
    private String model;
    private int serialNumber;

    public Car() {
    }

    public Car(@Nullable String series, @Nullable String model, @Nullable int serialNumber) {
        this.series = series;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(@Nullable String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(@Nullable String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(@Nullable int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "The car is a model " + model + " series " + series + " has a serial number " + serialNumber;
    }
}
