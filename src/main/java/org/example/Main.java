package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Петька1", "Курьер", "dsf1@mail.ru", "+339", 30000, 29);
        employees[1] = new Employee("Петька2", "Курьер", "dsf2@mail.ru", "+338", 35000, 28);
        employees[2] = new Employee("Петька3", "Курьер", "dsf3@mail.ru", "+337", 36000, 27);
        employees[3] = new Employee("Петька4", "Курьер", "dsf4@mail.ru", "+336", 37000, 26);
        employees[4] = new Employee("Петька5", "Курьер", "dsf5@mail.ru", "+335", 38000, 25);

        for (Employee employee : employees) {
            employee.displayInfo();
        }

        Park park = new Park();
        park.addAttraction("Горки", "10:00-20:00", 4);
        park.addAttraction("Качели", "10:00-20:00", 3);
        park.addAttraction("Падение воздушное", "10:00-20:00", 5);

        park.displayAttractions();
    }
}
