package org.example;

public class Park {
    private Attraction[] attractions;
    private int count;

    public Park() {
        attractions = new Attraction[3]; // Максимум 3 аттракциона
        count = 0;
    }

    public void addAttraction(String name, String workingHours, int cost) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, cost);
        } else {
            System.out.println("Невозможно добавить больше аттракционов");
        }
    }

    public void displayAttractions() {
        System.out.println("Список аттракционов:");
        for (int i = 0; i < count; i++) {
            attractions[i].displayInfo();
        }
    }

    private static class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println("-------------------");
        }
    }
}
