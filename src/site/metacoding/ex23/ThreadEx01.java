package site.metacoding.ex23;

public class ThreadEx01 {

    // main Threat start
    public static void main(String[] args) {
        System.out.println(1);
        try {
            Thread.sleep(2000);// millis 1/1000 seconds
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }
}
