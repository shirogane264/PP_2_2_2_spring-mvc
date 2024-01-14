package web.model;
public class Car {

    private String model;

    private String number;

    private int horsePower;

    public Car(String model, String number, int horsePower) {
        this.model = model;
        this.number = number;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "model = " + model +
                ", number = " + number +
                ", horsePower = " + horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return number;
    }

    public void setSeries(String number) {
        this.number = number;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(short horsePower) {
        this.horsePower = horsePower;
    }
}