//請設計一簡易整數計算機程式，程式從使用者得到二個數字，並讓使用者選擇要進行那一個四則運算操作。最後輸出計算結果。(請注意除法的除0以及小數點問題)

import java.util.Scanner;

public class HW7_CalNum {
    public static void main(String[] argv) {
        System.out.print("這是簡易整數計算機，請依序輸入兩組數字。\n第一組：");
            Scanner sc = new Scanner(System.in);
            int num1= sc.nextInt();
            System.out.print("第二組：");
            int num2= sc.nextInt();
        System.out.print("請選擇運算方式：1.加法 2.減法 3.乘法 4.除法：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int result1 = num1 + num2;
                    System.out.println("加法結果：" + result1);
                    break;
                case 2:
                    int result2 = num1 - num2;
                    System.out.println("減法結果：" + result2);
                    break;
                case 3:
                    int result3 = num1 * num2;
                    System.out.println("乘法結果：" + result3);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("除數不能為0");
                    } else {
                        double result4 = (double) num1 / num2;
                        System.out.println("除法結果：" + result4);
                    }
                    break;
                default:
                    System.out.println("算法選擇錯誤，請重新選擇");
                    main(argv);
            }
            //詢問是否重新計算
            System.out.print("請問是否要重新計算？(Y/N)：");
            char choice2 = sc.next().charAt(0);
            if (choice2 == 'Y' || choice2 == 'y') {
                main(argv); // 重新執行main
            } else {
                System.out.println("程式結束");
            }
   }
}