package site.metacoding.ex23;

// 스레드가 컨텍스트스위칭 할 땐 내부적으로 0.000000001초라도 졸고 넘어간다.
// 하나의 프로세스한에 여러개의 스레드가 동작한다.
// 스레드 일시정지 하는 법

class Monster {
    int x = 10;
    int speed = 1;
    boolean hunt = true;
}

class Host {
    int x = 0;
    int speed = 2;
    boolean hunt = true;
}

// 실습 -> Monster와 Host는 1초마다 각자의 Speed만큼 움직이는 run()을가진다.
// -> 둘의 x좌표가 동일해지면 게임은 종료된다.

public class ThreadEx05 {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Host host = new Host();

        Thread monsterThread = new Thread(() -> {
            while (monster.hunt) {
                try {
                    System.out.println("몬스터 현재위치 : " + monster.x);
                    Thread.sleep(1000);
                    monster.x = monster.x + monster.speed;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread hostThread = new Thread(() -> {
            while (host.hunt) {
                try {
                    System.out.println("호스트 현재위치 : " + host.x);
                    Thread.sleep(1000);
                    host.x = host.x + host.speed;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        monsterThread.start();
        hostThread.start();
        while (true) {
            if (host.x >= monster.x) {
                System.out.println("잡았다");
                monster.hunt = false;
                host.hunt = false;
                break;
            } else {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
