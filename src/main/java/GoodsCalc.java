import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class GoodsCalc {
    int quantity;

    GoodsCalc(int num) {
        quantity = num;
    }
    Object[] intyped = getGoods(quantity);
    String s = intyped[1].toString();
    double sum = Double.parseDouble(s);
    String l = intyped[2].toString();
    int k = Integer.parseInt(l);
    /*Object[] intyped = getGoods(quantity);
    public String names = intyped[1].toString();
    public double sum = Double.parseDouble(s);
    public String l = intyped[2].toString();
    public int k = Integer.parseInt(l);
    answerShow(names,sum,quantity,k);*/
    public Object[] getGoods(int n)  {
        int quantity =n;
        Scanner input = new Scanner(System.in);
        String names = "";
        String stoper = "";
        double sum = 0;
        int k = 0;
        while (stoper != "завершить") {
            System.out.println("Введите название товара");
            String productName = input.next();
            if (k != 0) {
                names += " " + productName;
            } else {
                names += productName;
            }
            System.out.println("Введите цену товара (в формате рубли.копейки)");
            double productPrice;
            while (true) {
                try {
                    productPrice = Double.parseDouble(input.next());
                    break;
                } catch (Exception e) {
                    System.out.println("Неверный ввод!");
                }
            }
            if (productPrice < 0.00) {
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
            if (stoper.equals("завершить")) {
                break;
            }
        }
        Object[] arr = new Object[3];
        arr[0] = names;
        arr[1] = sum;
        arr[2] = k;
        return arr;
    }
    /*void answerShow(String s,double j, int n, int calc){
            String resultS = "";
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
            if ((answer < 2) & (answer >= 1)) {
                System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рубль");
            } else if ((answer % 10 >= 2) & (answer % 10 <= 4) & (answer <= 10)) {
                System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рубля");
            } else if ((answer % 10 >= 5) & (answer % 10 <= 9) & (answer <= 10) | (answer % 10 == 0)) {
                System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рублей");
            } else if ((answer % 10 >= 2) & (answer % 10 <= 9)) {
                System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рублей");
            } else {
                System.out.println("Полученная сумма, которую должен заплатить каждый человек = " + result + " рублей");
            }
    }*/
}