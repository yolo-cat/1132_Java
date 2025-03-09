import java.util.Scanner;

public class HW5_Num2 {
    public static void main(String[] argv) {
        System.out.print("計算 1 + 2 + 3 + ... + n 又稱等差數列求和。請設定 n 一個任意正整數，我將為您計算：");
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
                    if (num <= 0) {
                        System.out.println("請輸入正整數");
                    }
                        else if (num == 1) {
                        System.out.println("答案為 1");
                        }
                        else if (num == 2) {
                        System.out.println("答案為 1 + 2 = 3");
                        }
                        else if (num == 3) {
                        System.out.println("答案為 1 + 2 + 3 = 6");
                        }
                        else if (num == 4) {
                        System.out.println("答案為 1 + 2 + 3 + 4 = 10");
                        }
                            else {
                            System.out.println("#使用配對法計算說明#");
                            System.out.println("1 + 2 + 3 +...+ " + num + " = 1 + 2 + 3 +...+(n-1)+n，給總和一個代號 = S");
                                System.out.println("S = 1 + 2 + 3 + ... + (n-1) + n");
                            System.out.println("步驟一：我們也可以倒過來寫，S = n + (n-1) + (n-2) + ... + 1");
                            System.out.println("步驟二：將兩個式子相加：");
                                System.out.println("S + S = (1+n) + (2+(n-1)) + (3+(n-2)) + ... + ((n-1)+2) + (n+1)");
                            System.out.println("步驟三：我們可以發現，這樣的配對法總共有 n 組，每組的和都是 n+1");
                            System.out.println("步驟四：因此 2S = n * (n+1) ");
                            System.out.println("步驟四：所以總和 S = " + num + " * " + (num+1) + " / 2 = " + (num*(num+1)/2));

                    }
            }
    }