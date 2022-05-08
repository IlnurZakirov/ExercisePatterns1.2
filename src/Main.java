import java.util.*;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance()
                .log("Запускаем программу")
                .log("Просим пользователя ввести входные данные для списка");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Введите размер списка: ");
                int capacity = scanner.nextInt();
                System.out.print("Введите верхнюю границу для значений: ");
                int length = scanner.nextInt();
                logger.log("Создаём и наполняем список");
                List<Integer> source = new ArrayList<>();
                Random random = new Random();
                System.out.print("Вот случайный список: ");
                for (int i = 0; i < capacity; i++) {
                    source.add(random.nextInt(length + 1));
                    System.out.print(source.get(i) + " ");
                }
                System.out.print("\n");
                logger.log("Просим пользователя ввести входные данные для фильтрации");
                System.out.print("Введите порог для фильтра: ");
                int treshold = scanner.nextInt();
                Filter filter = new Filter(treshold);
                List<Integer> result = filter.filterOut(source);
                System.out.print("Отфильтрованный список: ");
                for (int element : result) {
                    System.out.print(element + " ");
                }
                System.out.print("\n");
                logger.log("Завершаем программу");
                scanner.close();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Необходимо ввести число");
            }
        }
    }
}
