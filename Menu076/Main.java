public class Main {

    public static void main(String[] args) {

        Menu lunch = new Menu();
        lunch.addMeal("Hamburger");
        lunch.addMeal("Fish'n'Chips");
        lunch.addMeal("sauerkraut");
        lunch.addMeal("Hamburger");

        lunch.printMeals();
        lunch.clearMenu();
        lunch.printMeals();
    }
}
