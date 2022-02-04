package site.metacoding.ex23;

public class ThreadEx04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            // { } 내부가 run 메서드
        });

        t1.start();
        System.out.println("메인쓰레드 종료");
    }
}
