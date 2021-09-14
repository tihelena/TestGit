package hw4;

import java.util.*;

public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<String> list = new ArrayList<String>(Arrays.asList("cat", "dog", "monkey", "snake", "bear", "fox", "lion",
                "wolf", "frog", "cat", "fox", "dog", "cat", "dog", "bear"));
        System.out.println("Список: " + list);

        Set<String>uniqueWord = new HashSet<>(list);
        System.out.println("Уникальные слова в списке "+ uniqueWord);

        System.out.println("Частота слов в списке:");

        for(String w: uniqueWord){
            System.out.println(w + ": " + Collections.frequency(list, w));
        }

        System.out.println("Задание 2");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "903-987-12-15");
        phoneBook.add("Petrov", "905-135-18-90");
        phoneBook.add("Sidorov", "977-243-65-87");
        phoneBook.add("Ivanov", "916-175-86-40");

        System.out.println(phoneBook.get("Ivanov"));

    }
}
