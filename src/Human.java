public class Human extends Animal {
    private String HumansName;
    private int HumansAge;
    private Car HumansCar;


    Human(String HumansName,int HumansAge, Car HumansCar) {
        this.HumansName = HumansName;
        this.HumansAge = HumansAge;
        this.HumansCar = HumansCar;
    }

    @Override
    public void eat() {
        System.out.println("Human is eating!");
    }

    @Override
    public void movement() {
        System.out.println("Human " + HumansName+ " is driving a car: " + HumansCar.getColor() + " "+
                HumansCar.getModel()+ " с двигателем "+ HumansCar.getEngine().getPower() +" лошадиных сил"
        );
    }


}
