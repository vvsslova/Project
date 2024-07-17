public class Test {
    public static void main(String[] args) {
        Engine EngineOfCar = new Engine(EngineType.ENGINEOFCAR, 300);
        Car BMW = new Car("black", "BMW", 2_000, EngineOfCar);
        Engine EngineOfShip = new Engine(EngineType.ENGINEOFSHIP, 15000);
        Ship GeraldRFord = new Ship("white", "Gerald R.Ford", 100_000_000, EngineOfShip);
        Engine EngineOfPlane = new Engine(EngineType.ENGINEOFPLANE, 10000);
        Plane Boeing777  = new Plane ("red", "Boeing 777", 166_881, EngineOfPlane);


        Dog dog = new Dog();
        dog.setName("Gatsby");
        Car HumansCar = new Car("white", "audi",2_000, EngineOfCar);
        Human human = new Human("Max", 20, HumansCar);
        human.setName("Max");


//фу, Боже, что это............//

        System.out.println(GeraldRFord.getModel());
        System.out.println(Boeing777.getEngine().getPower());
        BMW.drive();
        System.out.println(dog.getName());
        System.out.println(human.getName());
        human.movement();







    }
}

