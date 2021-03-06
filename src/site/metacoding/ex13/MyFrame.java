package site.metacoding.ex13;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

    public MyFrame() {

        setSize(600, 400); // width, height
        setLocationRelativeTo(null); // 프레임 화면 중앙에 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 메인 종료

        JPanel panel = (JPanel) getContentPane(); // JFrame의 패널 가져오기

        JButton btn1 = new JButton("버튼1");
        panel.add(btn1);

        setVisible(true); // 그림 그리기
    }
}
