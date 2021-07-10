public class Car {
    // required data
    private int year;
    private String make;
    private String model;

    // optional data
    private String trim;
    private String color;
    private String milage;
    private String vin;

    public Car(Builder builder){
        this.year = builder.year;
        this.make = builder.make;
        this.model = builder.model;
        this.trim = builder.trim;
        this.color = builder.color;
        this.milage = builder.milage;
        this.vin = builder.vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getTrim() {
        return trim;
    }

    public String getColor() {
        return color;
    }

    public String getMilage() {
        return milage;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", color='" + color + '\'' +
                ", milage='" + milage + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

    static class Builder {
        private int year;
        private String make;
        private String model;

        // optional data
        private String trim;
        private String color;
        private String milage;
        private String vin;

        public Builder setTrim(String trim) {
            this.trim = trim;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMilage(String milage) {
            this.milage = milage;
            return this;
        }

        public Builder setVin(String vin) {
            this.vin = vin;
            return this;
        }

        public Builder(int year, String make, String model){
            this.year = year;
            this.make = make;
            this.model = model;
        }

        public Car build() {
            return new Car(this);
        }
    }


}
