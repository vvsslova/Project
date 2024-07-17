public class Engine {
    private EngineType engineType;
    private final int power;

    Engine(EngineType engineType, int power) {
        this.power = power;
        this.engineType = engineType;
    }

    public EngineType getEngine (){
        return engineType;
    }

    public int getPower() {
        return power;
    }
}
