package transport;

public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String colorBody;
    private int speedMax;

    public Transport(String brand, String model, int year, String country, String colorBody, int speedMax) {
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        setColorBody(colorBody);
        setSpeedMax(speedMax);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "некорректные данные";
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "некорректные данные";
        }

    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColorBody() {
        return colorBody;
    }

    public void setColorBody(String colorBody) {
        if (colorBody != null && !colorBody.isBlank() && !colorBody.isEmpty()) {
            this.colorBody = colorBody;
        } else {
            this.colorBody = "белый";
        }

    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        if (speedMax > 0) {
            this.speedMax = speedMax;
        }
    }

}



