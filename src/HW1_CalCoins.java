import java.util.Scanner;

public class HW1_CalCoins {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入金額，系統將計算10/5/1元硬幣最少數量，最高999元)：");
        int coins = sc.nextInt();
        int coins10 = coins / 10;
        int coins5 = (coins % 10) / 5;
        int coins1 = (coins % 10) % 5;
        if (coins > 999) {
            System.out.println("超過投入限制");
        } else {
            System.out.println("10元硬幣："+ coins10);
            System.out.println("5元硬幣："+ coins5);
            System.out.println("1元硬幣："+ coins1);
        }
    }
}