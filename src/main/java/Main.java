import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счёт?");
        int quantity = input.nextInt();
        if (quantity <= 1) {
            System.out.println("Вы ввели неправильное количество. Введите заново количество человек, на которых необходимо разделить счёт");
            quantity = input.nextInt();
        }
        String names = "";
        String stoper = "";
        double sum = 0;
        int k = 0;
        while (stoper!="завершить") {
            System.out.println("Введите название товара");
            String productName = input.next();
            if (k!=0) {
                names = names + " " + productName;
            }
            else {
                names = names + productName;
            }
            System.out.println("Введите цену товара (в формате рубли.копейки)");
            double productPrice = input.nextDouble();
            if (productPrice < 0.00){
                System.out.println("Вы ввели неправильную цену товара (она не может быть отрицательной)");
                System.out.println("Введите новую цену товара (в формате рубли.копейки)");
                productPrice = input.nextDouble();
            }
            sum = sum + productPrice;
            System.out.println("Товар успешно добавлен");
            k = k + 1;
            System.out.println("Если хотите закончить добавление товаров, то просто введите 'Завершить', если хотите продолжить, то можете ввести любую другую комбинацию символов");
            stoper = input.next();
            stoper = stoper.toLowerCase();
            if (stoper.equals("завершить")){
                break;
            }
        }
        System.out.println("Добавленные товары списком:");
        String[] arr = names.split("\\s");
        for (int i = 0; i < k; i++){
            System.out.println(arr[i]);
        }
        double answer = sum / quantity;
        String result = String.format("%.2f",answer);
        if (sum >= 2) {
            System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + "рубля");
        }
        else {
            System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + "рубль");
        }
    }
}
