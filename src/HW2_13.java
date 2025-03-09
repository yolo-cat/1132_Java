import java.util.*;

public class HW2_13 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
            System.out.print("請輸入一個整數，系統將計算除以13的商數和餘數：");
            int num_input = sc.nextInt();
            int num1_output = num_input / 13;
            int num2_output = num_input % 13;
            System.out.println("商數=" + num1_output);
            System.out.println("餘數=" + num2_output);
        }
    }

