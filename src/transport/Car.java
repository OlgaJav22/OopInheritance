package transport;

public class Car extends Transport {

    private String transmission;
    private String bodyType;
    private String registrationNumber;



    public Car(String brand, String model, int year, String country, String colorBody, int speedMax) {
        super(brand, model, year, country, colorBody, speedMax);
    }

    public void refill () {
        System.out.println("Заправить бензином");
        System.out.println("Заправить дизелем");
        System.out.println("Зарядить электрокар");
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}