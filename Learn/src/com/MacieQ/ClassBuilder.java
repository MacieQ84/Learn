package com.MacieQ;


public class ClassBuilder {

    public static void main(String[] args) {

        //wywołanie buildera
        Car car = new Car.CarBuilder().setBrand("Citroen")
                .setModel("C4")
                .setColour("Biały")
                .setEngine(1.6)
                .setMileage(93000)
                .carBuild();
        System.out.println(car.toString());
        System.out.println(" ");
    }
}

class Car {

    private String brand;
    private String model;
    private String colour;
    private double engine;
    private int mileage;

    private Car(String brand, String model, String colour, double engine, int mileage) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.mileage = mileage;

    }
    public String toString(){
        return ("Marka: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Kolor: " + colour + "\n" +
                "Silnik: " + engine + "\n" +
                "Przebieg: " + mileage
        );
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private String colour;
        private double engine;
        private int mileage;

        public CarBuilder() {
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public CarBuilder setEngine(double engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }
        public Car carBuild(){
            return new Car(brand, model, colour, engine, mileage);
        }

    }
}



