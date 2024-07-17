public class Human extends Animal {
    private String humansName;
    private int humansAge;
    private Car humansCar;

//прошу, не докапывайся!!!!!!!!!//
    Human(String humansName,int humansAge, Car humansCar) {
        this.humansName = humansName;
        this.humansAge = humansAge;
        this.humansCar = humansCar;
    }

    @Override
    public void eat() {
        System.out.println("Human is eating!");
    }

    @Override
    public void movement() {
        System.out.println("Human " + humansName+ " is driving a car: " + humansCar.getColor() + " "+
                humansCar.getModel()+ " с двигателем "+ humansCar.getEngine().getPower() +" лошадиных сил"
        );
    }


}
