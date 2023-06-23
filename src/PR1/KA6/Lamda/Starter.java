package PR1.KA6.Lamda;

import java.util.List;

public class Starter {

    public static void main(String[] args) {

        int vergleichsAlter=40;

        Person p1 = new Person("Tip", Person.Sex.DIVERS);
        Person p2 = new Person("Trick", Person.Sex.MALE);
        Person p3 = new Person("Daisy", Person.Sex.FEMALE);
        Person p4 = new Person("Track", Person.Sex.MALE);
        Person p5 = new Person("Donald", Person.Sex.MALE);

        p1.setAge(12);
        p2.setAge(11);
        p3.setAge(41);
        p4.setAge(9);
        p5.setAge(51);

        List<Person> personList = List.of(p1, p2, p3, p4, p5);

        Person.printPersonOlderThan(personList, vergleichsAlter);
    }
}
