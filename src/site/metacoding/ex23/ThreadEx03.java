package site.metacoding.ex23;

// 익명 클래스 만들기
public class ThreadEx03 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i < 6; i++) {
                    try {
                        System.out.println("새로운쓰레드 : " + i);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        t1.start();
        System.out.println("메인쓰레드 종료");
    }
}
