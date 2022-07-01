package camp.java.project4;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BranchNum extends JPanel {
	public BranchNum() {
		setLayout(null);
		String num = JOptionPane.showInputDialog(null, "Branch의 수를 입력하세요.", "LadderGame", JOptionPane.PLAIN_MESSAGE);
		MainFrame.branchNum = Integer.parseInt(num); 
		System.out.println("Branch Num : " + num);
	}
}
