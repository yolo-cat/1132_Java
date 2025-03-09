import java.util.*;

public class HW4_Num {
    public static void main(String[] argv) {
        System.out.print("判斷奇數偶數，請輸入任意整數：");
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + "是偶數");
                    }
                        else {
                            System.out.println(num + "是奇數");
                        }
            }
    }