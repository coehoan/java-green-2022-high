package site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMissmatchException

        // 통신, 사용자입력 예외처리!

        try {
            int x = sc.nextInt();
            System.out.println("받은 값 : " + x);
        } catch (InputMismatchException e) {
            System.out.println("==============================");
            System.out.println("문자입력 하지마세요");
            System.out.println("==============================");
            e.printStackTrace();
        }

    }
}
