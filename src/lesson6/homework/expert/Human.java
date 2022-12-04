package lesson6.homework.expert;

//(атрибуты - возраст, имя, вес. Метод: инфо о человеке):
public class Human {
    private int age;
    private String name;
    private double weight;

    private Human() {
    }

    public void getInfo() {
        System.out.printf("%s %s %s", age, name, weight);
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private Human human = new Human();

        public HumanBuilder age(int newAge) {
            human.setAge(newAge);
            return this;
        }

        public HumanBuilder name(String newName) {
            human.setName(newName);
            return this;
        }

        public HumanBuilder weight(double weight) {
            human.setWeight(weight);
            return this;
        }

        public Human build() {
            return human;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
