package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    // Map для хранения фамилий и списка номеров
    private final Map<String, List<String>> phoneBook = new HashMap<>();

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        phoneBook
                .computeIfAbsent(lastName, k -> new ArrayList<>()) // Исправлен метод
                .add(phoneNumber);
    }

    // Метод для поиска номеров по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    // Главный метод для запуска программы
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление записей
        phoneBook.add("Иванов", "234234");
        phoneBook.add("Петров", "32423432");
        phoneBook.add("Сидоров", "3233243");
        phoneBook.add("Кузнецов", "34545435");
        phoneBook.add("Иванов", "436456");

        // Поиск номеров по фамилии
        System.out.println("Телефоны для фамилии Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны для фамилии Петров: " + phoneBook.get("Петров"));
        System.out.println("Телефоны для фамилии Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны для фамилии Кузнецов: " + phoneBook.get("Кузнецов"));
    }
}
