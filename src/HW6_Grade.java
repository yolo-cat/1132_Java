import java.util.*;

public class HW6_Grade {
    public static void main(String[] argv) {
        System.out.print("輸入學生成績(0-100)：");
        Scanner sc = new Scanner(System.in);
            int Grade = sc.nextInt();
                    if (Grade >= 0 && Grade <= 100) {
                        if (Grade >= 90) {
                            System.out.println("該生成績：A");
                        }
                            else if (Grade >= 80) {
                                System.out.println("該生成績：B");
                            }
                                else if (Grade >= 70) {
                                    System.out.println("該生成績：C");
                                }
                                    else if (Grade >= 60) {
                                        System.out.println("該生成績：D");
                                    }
                                        else {
                                            System.out.println("該生成績：不及格");
                                        }
                    }
                        else {
                            System.out.println("輸入錯誤(成績範圍 0-100)");
                        }
            }
    }