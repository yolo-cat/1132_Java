//已知男生標準體重 = (身高 - 80) * 0.7；女生標準體重 = (身高 - 70) * 0.6。試寫一程式由使用者處得性別、身高之數據後輸出其標準體重。

import java.util.Scanner;

public class HW8_CalWeight {
    public static void main(String[] argv) {
        // 第一步：輸入性別
        System.out.print("請輸入您的生理性別(1.男 / 2.女) ");
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        // 判斷性別是否在範圍內
        if (gender != 1 && gender != 2) {
            System.out.println("性別輸入錯誤，請重新選擇");
            main(argv); //返回重新輸入
        }
            else {
                // 第二步：輸入身高
                System.out.print("請輸入您的身高 (適用範圍 130~200 公分)：");
                double height = sc.nextDouble();
                // 判斷身高是否在範圍內
                if (height < 130 || height > 200) {
                    System.out.println("身高不在範圍內，請重新輸入。");
                    main(argv); //返回重新輸入
                    }
                    else {
                        // 第三步：根據性別計算標準體重
                        double standardWeight;
                        switch (gender) {
                            case 1:
                                standardWeight = (height - 80) * 0.7;
                                System.out.printf("男性，身高對應標準體重：" + standardWeight);
                                break;
                            case 2:
                                standardWeight = (height - 70) * 0.6;
                                System.out.printf("女性，身高對應標準體重：" + standardWeight);
                                break;
                        }
                    }
                //詢問是否重新計算
                System.out.print("\n請問是否要重新計算？(Y/N)：");
                char choice2 = sc.next().charAt(0);
                if (choice2 == 'Y' || choice2 == 'y') {
                    main(argv); // 重新執行main
                }
                    else {
                    System.out.println("程式結束");
                    }
            }
    }
}
