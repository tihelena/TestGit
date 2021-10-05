package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Елена", Arrays.asList(new Course("Литература"), new Course("Биология"),
                new Course("Маркетинг"), new Course("Веб-разработка"), new Course("Тестирование ПО"))));
        students.add(new Student("Ольга", Arrays.asList(new Course("Маркетинг"), new Course("Веб-дизайн"))));
        students.add(new Student("Анна", Arrays.asList(new Course("Веб-дизайн"), new Course("Маркетинг"),
                new Course("Искусствоведение"))));
        students.add(new Student("Андрей", Arrays.asList(new Course("Математика"), new Course("Физика"),
                new Course("Химия"), new Course("Биология"))));
        students.add(new Student("Олег", Arrays.asList(new Course("Математика"), new Course("Программирование"),
                new Course("Тестирование ПО"))));


        // Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.

        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        //Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных
        // (любознательность определяется количеством курсов).

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));

        //Написать функцию, принимающую на вход список Student и экземпляр Course,
        // возвращающую список студентов, которые посещают этот курс.

        Course course = new Course("Тестирование ПО");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }


}
