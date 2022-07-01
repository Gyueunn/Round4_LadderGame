package camp.java.project4;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class PrintResult {
	String [] allResult = new String[MainFrame.num];
	public PrintResult() {
		for(int i=0; i<MainFrame.num; i++) {
			allResult[i] = MainFrame.name[MappingBranch.mapping[i]] + " = " +MainFrame.target[i];
		}
		System.out.println(Arrays.toString(allResult));
		System.out.println("This is PrintResult");
		JOptionPane.showMessageDialog(null, Arrays.toString(allResult), "Result", JOptionPane.PLAIN_MESSAGE);
	}
}