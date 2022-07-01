package camp.java.project4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Result {
	static boolean flag = false;
	static boolean tarFlag = true;
	static ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	String input = e.getActionCommand();
        	if(input.equals("New Branch!!")) {
        		new SetBranch();
        		flag = true;
        	}
        	else if(input.equals("Result")) {
        		if(flag == true) {
//        			flag = false;
		       		 MainFrame.getTargetName();
		       		 if(tarFlag==true) {
		       			new MappingBranch();
		       			new PrintResult();
		       		 }
        		}
        		else {
        			JOptionPane.showMessageDialog(null, "Branch를 먼저 생성하세요!!", "MESSAGE", JOptionPane.PLAIN_MESSAGE);
        		}
        	}
        }
	};
}
