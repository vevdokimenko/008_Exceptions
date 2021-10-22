package homework.task2;

import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    private static void getWorkersWithExperience(int experience, Worker[] workers) {
        for (Worker worker : workers) {
            if (Year.now().getValue() - worker.getYear().getValue() > experience)
                System.out.println(worker.getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countWorkers = 5;
        int experience;
        Worker[] workers = new Worker[countWorkers];

        for (int i = 0; i < countWorkers; i++) {
            System.out.printf("Введите данные %s работника в формате: Фамилия ИО, Должность, год_поступления_на_работу:\n", i + 1);
            try {
                workers[i] = new Worker(sc.nextLine().split(","));
                System.out.println(workers[i]);
            } catch (DateTimeParseException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Введите число лет, чтобы проверить стаж:");
        experience = sc.nextInt();

        getWorkersWithExperience(experience, workers);
    }
}
