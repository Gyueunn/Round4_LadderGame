package camp.java.project4;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	public static JPanel main = new JPanel();
	public static int branchNum;
	public static int num;
	public static JButton branchButton, result;
	public static String[] name;
	public static JButton [] nameButton;
	public static String[] target; //target의 내용을 저장할 배열
	public static JTextField [] targetText; //target의 내용을 작성할 텍스트 
	public int W;
	public int d;
	
	public MainFrame() {
		this.setTitle("LadderGame");
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		new Personnel();
		new BranchNum();
//		main.setBackground(Color.cyan);
		main.setLayout(null);
		new LadderPanel();
		this.add(main);
		W=600;
		d = W/(MainFrame.num-1);
		SetNameButton();
		SetTargetText();
		setButton();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	public void SetNameButton() {
		name = new String[MainFrame.num];
		nameButton = new JButton[name.length];
		String allName = JOptionPane.showInputDialog(null, MainFrame.num + "명의 이름을 입력하세요. ( ','로 구분하세요. )", "LadderGame", JOptionPane.PLAIN_MESSAGE);
		name = allName.split(",");
		for(int i=0; i< MainFrame.num; i++) {
			nameButton[i] = new JButton(name[i]);
			nameButton[i].setBounds(175+i*d, 100, 50, 50);
			main.add(nameButton[i]);
			nameButton[i].addActionListener(SelectPerson.listener);
		}
	}
	
	public void SetTargetText() {
		//String[] target = new String[MainFrame.num];
		targetText = new JTextField[MainFrame.num];
		for(int i=0; i< MainFrame.num; i++) {
			targetText[i] = new JTextField("");
			targetText[i].setBounds(170+i*d, 550, 60, 35);
//			targetText[i].setBackground(Color.cyan);
			main.add(targetText[i]);
		}
	}
	
	public void setButton() {
		branchButton = new JButton("New Branch!!");
		result = new JButton("Result");
		branchButton.setBounds(720, 610, 140, 35);
		branchButton.setFont(new Font("Arial", Font.PLAIN, 20));
		result.setBounds(870, 610, 100, 35);
		result.setFont(new Font("Arial", Font.PLAIN, 20));
		branchButton.addActionListener(Result.listener);
		result.addActionListener(Result.listener);
		main.add(branchButton);
		main.add(result);
	}
	
	public static void getTargetName() { //target에 적힌 내용 읽어오기
		target = new String [MainFrame.num];
		Result.tarFlag = true;
		for(int i=0; i< MainFrame.num; i++) {
			if(!targetText[i].getText().equals("")){
				target[i] = targetText[i].getText();
			}
			else {
				JOptionPane.showMessageDialog(null, "Target에 입력되지 않은 항목이 있습니다!!", "MESSAGE", JOptionPane.PLAIN_MESSAGE);
				Result.tarFlag = false;
				break;
			}
		}
		System.out.println("ㅁㅁ : " +Arrays.toString(target));
	}
}
