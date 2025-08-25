class Car {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println(brand + " " + model + " "+year+ " is starting...");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Honda";
        car.model = "City";
        car.year = 2022;

        car.start();
    }
}
 