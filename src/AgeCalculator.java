import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення дати народження з клавіатури
        System.out.println("Введіть свою дату народження у форматі YYYY-MM-DD:");
        String birthDateString = scanner.nextLine();

        // Парсимо введену дату
        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ISO_LOCAL_DATE);

        // Отримуємо поточну дату та час
        LocalDateTime now = LocalDateTime.now();

        // Визначаємо період між датою народження та поточною датою
        Duration duration = Duration.between(birthDate.atStartOfDay(), now);

        // Виводимо результат
        System.out.println("Вам виповнилося " + duration.toDays() / 365 + " років, " +
                duration.toDays() % 365 / 30 + " місяців, " +
                duration.toDays() % 30 + " днів, " +
                duration.toHoursPart() + " годин, " +
                duration.toMinutesPart() + " хвилин та " +
                duration.toSecondsPart() + " секунд");

        // Закриваємо сканер
        scanner.close();
    }
}
