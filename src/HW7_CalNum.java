// 最後輸出計算結果。(請注意除法的除0以及小數點問題)

import java.util.Scanner;

public class HW7_CalNum {
    public static void main(String[] argv) {
        System.out.print("這是簡易整數計算機，請依序輸入兩組數字：");
            Scanner sc = new Scanner(System.in);
            int num1= sc.nextInt();
            int num2= sc.nextInt();
        System.out.print("請選擇運算方式：1.加法 2.減法 3.乘法 4.除法：");
            int choice = sc.nextInt();
            int result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("加法結果：" + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("減法結果：" + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("乘法結果：" + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("除數不能為0");
                    } else {
                        double divisionResult = (double) num1 / num2;
                        System.out.println("除法結果：" + divisionResult);
                    }
                    break;
                default:
                    System.out.println("無效的選擇");
            }
        sc.close();
    }
}
// 這是簡易整數計算機，請依序輸入兩組數字：10 5
