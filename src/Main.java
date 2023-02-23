public class Main {
    public static void main(String[] args) {
        // Создание магической коробки для строк
        for (int i = 0; i < 5; i++){
            MagicBox<String> stringBox = new MagicBox<>(3);
            stringBox.add("Абракадабра");
            stringBox.add("Фокус Покус");
            stringBox.add("Сезам откройся");

            // Выбор случайной строки из коробки
            String randomString = stringBox.pick();
            System.out.println("Случайная строка из коробки: " + randomString);

            // Создание магической коробки для чисел
            MagicBox<Integer> integerBox = new MagicBox<>(4);
            integerBox.add(42);
            integerBox.add(7);
            integerBox.add(13);
            integerBox.add(99);

            // Выбор случайного числа из коробки
            Integer randomNumber = integerBox.pick();
            System.out.println("Случайное число из коробки: " + randomNumber + "\n");
        }
    }
}