package com.MacieQ;


public class ClassBuilder {

    public static void main(String[] args) {

        Home home = new Home.HomeBuilder()
                .setSize(64)
                .setColour("red")
                .setForRent(false)
                .setRooms(3)
                .homeBuild();
        System.out.println(home.toString());

        //wywołanie buildera Car
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

class Home {
    private double size;
    private String colour;
    private boolean forRent;
    private int rooms;

    private Home(double size, String colour, boolean forRent, int rooms) {
        this.size = size;
        this.colour = colour;
        this.forRent = forRent;
        this.rooms = rooms;
    }

    public String toString() {
        String rent;
        if (forRent)
            rent = "tak";
        else rent = "nie";


        return ("Mieszkanie wielości - " + size
                + ", w kolorze - " + colour
                + ", o liczbie pokoi: " + rooms
                + ", do wynajęcia: " + rent + "\n");
    }

    public static class HomeBuilder {
        private double size;
        private String colour;
        private boolean forRent;
        private int rooms;

        public HomeBuilder setSize(double size) {
            this.size = size;
            return this;
        }

        public HomeBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public HomeBuilder setForRent(boolean forRent) {
            this.forRent = forRent;
            return this;
        }

        public HomeBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Home homeBuild() {
            return new Home(size, colour, forRent, rooms);
        }
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

    public String toString() {
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

        public Car carBuild() {
            return new Car(brand, model, colour, engine, mileage);
        }

    }
}



