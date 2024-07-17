public class Plane extends Transport {
    Plane(String color, String model, int weight, Engine Engine) {
        this.color = color;
        this.model = model;
        this.weight = weight;
        this.Engine = Engine;
    }

    @Override
    public void drive() {
        System.out.println("The plane is flying!");
    }

    public Engine getEngine() {
        return Engine;
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
