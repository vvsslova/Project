public class Animal {
    private String name;
    private int age;

    public void eat (){
        System.out.println("Animal is eating!");
    }

    public void movement (){
        System.out.println("Animal is moving");
    }

    public void setName (String name) {
        if (name.isEmpty()){
            System.out.println("Введено пустое имя!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else {
            System.out.println("Возраст не может быть отрицательным числом!");
        }
    }

    public int getAge() {
        return age;
    }


}

