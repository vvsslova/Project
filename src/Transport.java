public abstract class Transport {
    protected String color;
    protected String model;
    protected int weight;
    protected Engine engine;

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

    public abstract void drive();

}
