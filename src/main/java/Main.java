import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("Введите год в формате: yyyy и количество-дней");
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            yearCheck(year);
            if (days == yearCheck(year)) {
                System.out.println("Отлично");
            } else {
                System.out.println("Неправильно! В этом году " + yearCheck(year) + " дней!");
                break;
            }
            a++;
        }
        System.out.println("Набрано очков: " + a);
    }

    public static int yearCheck(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }

}
