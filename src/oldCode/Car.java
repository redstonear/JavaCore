    package oldCode;

    public class Car {

        private String model;
        private int maxSpeed;
        private int yearOfManufacture;

        public Car(String model, int maxSpeed, int yearOfManufacture) {
            this.model = model;
            this.maxSpeed = maxSpeed;
            this.yearOfManufacture = yearOfManufacture;
        }


        public void gas() {
            //...газ
        }

        public void brake() {
            //...тормоз
        }
    }


    class Truck extends Car {

        public Truck(String model,
                     int maxSpeed,
                     int yearOfManufacture){
            super(model, maxSpeed, yearOfManufacture);
        }
    }

    class Sedan extends Car {
        public Sedan(String model,
                     int maxSpeed,
                     int yearOfManufacture) {
            super(model, maxSpeed, yearOfManufacture);
        }
    }
    class Main {
        public static void main(String[] args) {
            Car car1 = new Car("CLS", 280, 2019);
            System.out.println(car1);
        }
    }