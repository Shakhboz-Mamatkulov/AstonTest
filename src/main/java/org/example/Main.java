package org.example;

public class Main {
    public static void main(String[] args) {
        //1 и 2 задания Сотрудник + массив из 5 сотрудников
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Петька1", "курьер", "dsf1@mail.ru", "+339", 30000, 29);
        employees[1] = new Employee("Петька2", "курьер", "dsf2@mail.ru", "+338", 35000, 28);
        employees[2] = new Employee("Петька3", "курьер", "dsf3@mail.ru", "+337", 36000, 27);
        employees[3] = new Employee("Петька4", "курьер", "dsf4@mail.ru", "+336", 37000, 26);
        employees[4] = new Employee("Петька5", "курьер", "dsf5@mail.ru", "+335", 38000, 25);

        for (Employee employee : employees) {
            employee.displayInfo();
        }
        //Задание 3
        Park park = new Park();
        park.addAttraction("Горки", "10-20", 4);
        park.addAttraction("Качели", "10-20", 4);
        park.addAttraction("Падение воздушное", "10-20", 5);

        park.displayAttractions();
    }
}

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("-------------------");
    }
}

class Park {
    private Attraction[] attractions;
    private int count;

    public Park() {
        attractions = new Attraction[3]; //max 3 аттракциона
    }

    public void addAttraction(String name, String workingHours, int cost) {
        if (cost >= attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, cost);
        } else {
            System.out.println("невозможно добавить больше аттракционов");
        }
    }

    public void displayAttractions() {
        System.out.println("Список аттракционов");
        for (int i = 0; i < count; i++) {
            attractions[i].displayInfo();
        }
    }

    class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Название аттракциона:" + name);
            System.out.println("Часы работы:" + workingHours);
            System.out.println("Тугрики:" + cost );
            System.out.println("-------------------");
        }
    }
}
