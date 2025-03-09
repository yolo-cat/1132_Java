import java.util.*;

public class HW3_Cage {
    public static void main(String[] argv) {
        System.out.print("歡迎來到雞兔同籠計算機");
        Scanner sc = new Scanner(System.in);
            System.out.print("請輸入頭的數量：");
            int heads = sc.nextInt();
            System.out.print("請輸入腳的數量：");
            int legs = sc.nextInt();
                System.out.println("假設雞的數量為 x，兔的數量為 y");
                System.out.println("雞兔各有一顆頭，因此 x + y = " + heads);
                System.out.println("其雞有 2 條腿，兔有 4 條腿，因此 2x + 4y = " + legs);
                System.out.println("#本程式使用消去法解題");
                System.out.println("步驟一：將頭的數量方程式 (x + y = " + heads + ")乘以 2 = 2x + 2y = " + (heads * 2));
                System.out.println("步驟二：將腿的數量方程式 (2x + 4y = " + legs + ")減去步驟一方程式，將雞 x 消除，得到 2y = " + (legs - (heads * 2)));
                    if ((legs - (heads * 2 )) % 2 != 0 || ((legs - (heads * 2 )) < 0)) {
                        System.out.println("由於兔子 y=" + (legs - (heads * 2 )) + "/2 無法整除或出現負數，該數據無解!");
                    }
                        else if (heads - ((legs - (heads * 2 )) / 2) < 0) {
                            System.out.println("由於雞 x=" + (heads - ((legs - (heads * 2 )) / 2)) + "小於 1，該數據無解!");
                    }
                        else {
                            System.out.println("步驟三：得到 2y=" + (legs-(heads*2)) + "，因此 y=" + (legs-(heads*2))/2);
                            System.out.println("步驟四：將 y 帶入步驟一方程式 x+" + ((legs-(heads*2))/2) + "=" + heads + "得出 x=" + (heads-(legs-(heads*2))/2));
                            System.out.println("因此雞的數量為 " + (heads-(legs-(heads*2))/2) + "，兔的數量為 " + (legs-(heads*2))/2);
                            System.out.println("程式結束");
                        }
            }
    }