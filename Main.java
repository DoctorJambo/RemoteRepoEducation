import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6};
        numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int x = 4;
        short xx = (short) x;

        Integer a = Integer.valueOf(1237);
        Integer b = Integer.valueOf(1237);
        System.out.println(a.equals(b));

        String hello = "hello";
        String seyHello = new String("hello");
        seyHello = seyHello.intern();
        System.out.println(hello == seyHello);


        Student bob = new Student();
        bob.setAge(19);
        bob.setName("Bob");
        bob.setFavoriteSubject("Math");
        bob.getPersonalInfo();

        Employee alice = new Employee(3.4,45);
        alice.setAge(20);
        alice.setName("Alice");
        alice.getPersonalInfo();

        Person person = new Person();
        person.setAge(34);
        person.setName("Jhon");
        person.getPersonalInfo();



        System.out.println(">>>>>>toString overriding>>>>>>>>");
        System.out.println("а якщо без методів напряму з обєкта то треба перевизначити метод toString(): " + "\n" + alice);
        System.out.println("через гетер виводим інфо: " + alice.getAge());
        System.out.println(">>>>>>toString overriding>>>>>>>>");

        int age = 18;
        String massage = age >= 18 ?  "you can buy alcohol" : "you can not buy";
        System.out.println(massage);

        Season season = Season.SPRING;
        System.out.println(season);

        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));

        Random random = new Random();
        int randomValue = random.nextInt(44);
        System.out.println(randomValue);

        DayOfWeekSupplier day = new DayOfWeekSupplier();
        for (int i = 0; i < Season.values().length; i++) {
            System.out.println(day.getRandomDayOfWeek());
        }

        System.out.println("pull request");
    }
}