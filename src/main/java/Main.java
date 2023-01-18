import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счёт?");
        int quantity;
        //quantityChecky quant = new quantityCheck(quantity);
        while (true) {
            System.out.print("Введите число: ");
            try {
                quantity = Integer.parseInt(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        if (quantity <= 1) {
            System.out.println("Неверный ввод! ");
            System.out.println("Вы ввели неправильное количество. Введите заново количество человек, на которых необходимо разделить счёт");
            quantity = input.nextInt();
        }
        GoodsCalc calculation = new GoodsCalc(quantity);
        answerShow(calculation.intyped[0].toString(), calculation.sum, quantity, calculation.k);
    }
    static void answerShow(String s,double j, int n, int calc) {
         double sum = j;
         String names = s;
         int quantity = n;
         int k = calc;
         System.out.println("Добавленные товары списком:");
         String[] arr = names.split("\\s");
         for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
         }
         double answer = sum / quantity;
         String result = String.format("%.2f", answer);
         double mode10Answer = answer % 10;
         if ((answer < 2) && (answer >= 1)) {
            System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рубль");
         }
         else if ((mode10Answer >= 2) && (mode10Answer <= 4) && (answer <= 10)) {
            System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рубля");
         }
         else if ((mode10Answer >= 5) && (mode10Answer <= 9) && (answer <= 10) || (mode10Answer == 0)){
             System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рублей");
         } else if ((mode10Answer >= 2) && (mode10Answer <= 9)) {
             System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рублей");
         } else {
             System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рублей");
         }
    }
}
