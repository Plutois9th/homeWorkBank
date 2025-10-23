import java.util.Scanner;

public class InvestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите начальную сумму вклада: ");
        float currentSum = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();
        float monthlyPercent = 0.07f;
        //for (int i = 1; i <= months; i++) {
        //   currentSum = currentSum + (currentSum * monthlyPercent);

        // System.out.printf("Конечная сумма вклада через " + months +" месяцев: " + currentSum);

            int counter = 1;
            while(counter <= months) {
                currentSum = currentSum + (currentSum * monthlyPercent);
                System.out.printf("Конечная сумма вклада через " + months +" месяцев: " + currentSum);
                counter++;

            }
        }
    }
