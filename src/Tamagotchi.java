import java.util.Scanner;

public class Tamagotchi {
    private String name;
    private int foodLevel;     // Вводим показатель "еда"
    private int hygieneLevel;     // Вводим показатель "гигиена"
    private int happinessLevel;    // Вводим показатель "счастья"

    public Tamagotchi(String name) {         // Профиль питомца
        this.name = name;
        this.foodLevel = 5;
        this.hygieneLevel = 5;
        this.happinessLevel = 5;      // Установка начальных уровней потребностей
    }

    public void feed() {     // Действие "покормить" питомца
        foodLevel += 2;
        System.out.println(name + " покушал(-а).");
    }

    public void clean() {     // Действие "помыть" питомца
        hygieneLevel += 2;
        System.out.println(name + " чистый(-ая).");
    }

    public void play() {     // Действие "поиграть" с питомцем
        happinessLevel += 2;
        System.out.println(name + " счастлив(-а)");
    }

    public void displayStatus() {   // Потребности питомца
        System.out.println("\n"+"Статус потребностей:"+ name+"(-и)");
        System.out.println("Питание: " + foodLevel);
        System.out.println("Гигиена: " + hygieneLevel);
        System.out.println("Счастье: " + happinessLevel);
    }

    public static void main(String[] args) {    // Приветственная строка
        Scanner scanner = new Scanner(System.in);
        System.out.print("Придумайте и введите имя своего виртуального питомца: ");
        String tamagotchiName = scanner.nextLine(); // Сканирум и импортируем введенное имя питомца пользователем

        Tamagotchi tamagotchi = new Tamagotchi(tamagotchiName);

        System.out.println("Добро пожаловать в игру Тамагочи! Давайте позаботимся о " + tamagotchiName + "(е).\n");

        while (true) {
            tamagotchi.displayStatus(); // Выводим статус потребностей питомца

            System.out.println("\nВыберите действие:"); // Предлагаем пользователю выбрать действие
            System.out.println("1. Покормить " + tamagotchiName+ "(-у,-ю).\n");
            System.out.println("2. Помыть " + tamagotchiName+"(-у,-ю).\n");
            System.out.println("3. Поиграть с " + tamagotchiName+"(-ей).\n");
            System.out.println("4. Выйти\n");

            int choice = scanner.nextInt();

            switch (choice) { // В случае выбора действия пользователем выполняем функцию
                case 1:  // Выбрал "покушать"
                    tamagotchi.feed();
                    break;
                case 2: // Выбрал "помыть"
                    tamagotchi.clean();
                    break;
                case 3: // Выбрал "поиграть"
                    tamagotchi.play();
                    break;
                case 4: // Выбрал выйти
                    System.out.println("Пока!"); // Выводим текстовое прощание
                    System.exit(0);
                    break;
                default: // Если пользователь выбрал непрописанное действие выводим ему ошибку. Все доступные действия пронумерованы от 1 до 4
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.\n");
            }
        }
    }
}