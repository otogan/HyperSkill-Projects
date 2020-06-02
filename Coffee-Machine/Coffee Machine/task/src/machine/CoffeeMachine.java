package machine;

import java.util.Scanner;

public class CoffeeMachine {
    int water;
    int milk;
    int beans;
    int cups;
    int money;

    public CoffeeMachine() {
    }

    public CoffeeMachine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public void writeStats() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                "$" + money + " of money");
    }

    private String checkResources(int water, int milk, int beans) {
        String need = null;
        if (this.water < water) need = "water";
        if (this.milk < milk) need = "milk";
        if (this.beans < beans) need = "coffee beans";
        if (this.cups == 0) need = "disposable cups";
        return need;
    }

    public String checkResources(int coffee) {
        switch (coffee) {
            case 1:
                return checkResources(250, 0, 16);
            case 2:
                return checkResources(350, 75, 20);
            case 3:
                return checkResources(200, 100, 12);
        }
        return null;
    }

    public boolean buy(int coffee) {
        switch (coffee) {
            case 1:
                makeCoffee(250, 0, 16, 4);
                break;
            case 2:
                makeCoffee(350, 75, 20, 7);
                break;
            case 3:
                makeCoffee(200, 100, 12, 6);
                break;
        }
        return true;
    }

    private void makeCoffee(int water, int milk, int beans, int money) {
        this.water -= water;
        this.milk -= milk;
        this.beans -= beans;
        this.cups--;
        this.money += money;
    }

    public void fill(Scanner scanner) {
        System.out.println("Write how many ml of water do you want to add:");
        int water = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        fill(water, milk, beans, cups);
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    public int take() {
        int amount = money;
        money = 0;
        return amount;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String answer = scanner.nextLine();
                    if (answer.equals("back")) { break; }
                    int coffee = Integer.parseInt(answer);
                    String need = coffeeMachine.checkResources(coffee);
                    if (need == null) {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachine.buy(coffee);
                    } else {
                        System.out.println("Sorry, not enough " + need + "!");
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int water = Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milk = Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int beans = Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cups = Integer.parseInt(scanner.nextLine());
                    coffeeMachine.fill(water, milk, beans, cups);
                    break;
                case "take":
                    System.out.println("I gave you $" + coffeeMachine.take());
                    break;
                case "remaining":
                    coffeeMachine.writeStats();
                    break;
            }
        } while (!"exit".equals(action));


    }
}
