package site.metacoding.ex23;

class NewWorker implements Runnable {

    // 타겟
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                System.out.println("뉴워커스레드 : " + i);
                Thread.sleep(1000);// millis 1/1000 seconds
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadEx02 {

    // MainThread 의 타겟은 main 메서드
    public static void main(String[] args) {

        // NewWorker생성
        Thread newWorker = new Thread(new NewWorker());
        newWorker.start(); // run() 메서드 호출

        for (int i = 1; i < 6; i++) {
            try {
                System.out.println("메인스레드 : " + i);
                Thread.sleep(1000);// millis 1/1000 seconds
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
