import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третее число:");
        int c = scanner.nextInt();
        int sumOfThreeValues = Summa.sum(a, b, c);
        System.out.println("Результат сложения = " + sumOfThreeValues);

    }
}