import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya");
        Student student2 = new Student("Misha", Optional.ofNullable(new Address("Moscow", "None")));
        Student student3 = new Student("Oleg");
        Student student4 = new Student("Danik", Optional.ofNullable(new Address("Kazan", "tat")));

        printStudentInfo(student1);
        System.out.println();

        printStudentInfo(student2);
        System.out.println();

        printStudentInfo(student3);
        System.out.println();

        printStudentInfo(student4);
        System.out.println();

        List<String> words = new ArrayList<>();
        Collections.addAll(words, "random", "more", "words", "live", "moment", "city");

        System.out.println(words.stream().reduce((s1, s2) -> s1 + s2).get());
        System.out.println();
        System.out.println(words);
    }


    public static void printStudentInfo(Student student) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Name=" + student.getName());
            }
        };
        Optional.ofNullable(student.getAddress())
                .ifPresentOrElse(student1 -> System.out.println("Name=" + student.getName() + "\n"
                + "City=" + student.getAddress().get().getCity() + "\n"
                + "Region=" + student.getAddress().get().getRegion()), run);
    }

}
