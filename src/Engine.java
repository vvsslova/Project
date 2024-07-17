public class Engine {
    private EngineType EngineType;
    private final int power;

    Engine(EngineType EngineType, int power) {
        this.power = power;
        this.EngineType = EngineType;
    }

    public EngineType getEngine (){
        return EngineType;
    }

    public int getPower() {
        return power;
    }
}
