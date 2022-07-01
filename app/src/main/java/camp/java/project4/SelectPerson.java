package camp.java.project4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class SelectPerson {
	static boolean drawLine = false;
	
	static ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	String input = e.getActionCommand();
        	for(int i=0; i<MainFrame.num; i++) {
        		if(Result.flag==true) {
        			if(input.equals(MainFrame.name[i])) {
            			LadderPanel.startIndex = i;
            			drawLine = true;
            			LadderPanel ladderPanel = new LadderPanel();
            			ladderPanel.repaint();
            			break;
            		}
        		}
        		else {
        			JOptionPane.showMessageDialog(null, "Branch를 먼저 생성하세요!!", "MESSAGE", JOptionPane.PLAIN_MESSAGE);
        			break;
        		}
        	}
        }
	};
}
