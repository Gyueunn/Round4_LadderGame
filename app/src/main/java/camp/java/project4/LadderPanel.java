package camp.java.project4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LadderPanel extends JPanel {
	public int W = 600;
	public int H = 400;
	public int d;
	public int h;
	
	public static int startIndex; //시작하는 
	
	public LadderPanel() {
		this.setBounds(200, 150, 600, 400);
//		this.setBackground(Color.BLUE);
		MainFrame.main.add(this);
	}
	
	public void paintComponent(Graphics graphic){
		Graphics2D g = (Graphics2D) graphic;
		super.paintComponent(graphic);
		g.setStroke(new BasicStroke(1));

		d = W/(MainFrame.num-1);
		h = H/(MainFrame.branchNum+1);
		
		for(int i=0; i< MainFrame.num; i++) {
			g.drawLine(i*d, 0, i*d, 400);
		}
		
		if(SetBranch.draw == true) {
			for(int i=0; i <MainFrame.branchNum; i++) { //y값
	           for(int j=0; j<MainFrame.num; j++) { //x값
	              if(SetBranch.branch[i] == j) {
	                 g.drawLine(j*d, i*h+h, (j+1)*d, i*h+h);
	                 break;
	              }
	           }
			}
		}
		
		if(SelectPerson.drawLine == true) {
			int height = 0;
			for(int i=0; i<MainFrame.branchNum; i++) {
				 g.setColor(Color.BLUE);
				 g.setStroke(new BasicStroke(3));
				 g.drawLine(d*startIndex, h*i, d*startIndex,h*i+h); //세로 그리기 
				if(SetBranch.branch[i] == startIndex) {
					//오른쪽으로 가기
					g.drawLine(startIndex*d, i*h+h, (startIndex+1)*d, i*h+h); //가로 그리기 
					//index 이동 
					startIndex++;
				}
				else if(SetBranch.branch[i] == startIndex-1) {
					//왼쪽으로 가기
					g.drawLine((startIndex-1)*d, i*h+h, (startIndex)*d, i*h+h); //가로 그리기 
					//index 이동
					startIndex--;
				}
				if(i==MainFrame.branchNum-1) {
					height = h*i+h;
				}
			}
			
			while(height <= H) {
				g.drawLine(d*startIndex, height, d*startIndex,height+h);
				height+=h;
			}
			SelectPerson.drawLine = false;
		}
	}
}
