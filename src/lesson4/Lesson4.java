package lesson4;

public class Lesson4 {
    public static void main(String[] args) {

        Human yuri = new Human(20, "Yuri");
//        System.out.println(yuri.age);
//        System.out.println(yuri.name);

        Human petr = new Human(25, "Petr");
//        System.out.println(petr.name);

        yuri.setAge(21);
        petr.setAge(26);
        System.out.println(yuri.age);
        System.out.println(petr.age);


        yuri.setName("Максим");
        System.out.println(yuri.name);

       yuri.sayHi();
        System.out.println(yuri);
    }
}
