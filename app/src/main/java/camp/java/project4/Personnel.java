package camp.java.project4;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Personnel extends JPanel {

	public Personnel() {
		String num = JOptionPane.showInputDialog(null, "사다리를 탈 인원을 선택하세요.", "LadderGame", JOptionPane.PLAIN_MESSAGE);
		MainFrame.num = Integer.parseInt(num); 
		System.out.println("Num : " + num);
	}
}