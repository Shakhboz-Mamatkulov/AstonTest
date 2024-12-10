package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды.");
        }
    }

    public void decreaseFood(int amount) {
        food = Math.max(food - amount, 0);
    }
}
