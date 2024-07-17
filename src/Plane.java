public class Plane extends Transport {
    Plane(String color, String model, int weight, Engine engine) {
        this.color = color;
        this.model = model;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("The plane is flying!");
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
