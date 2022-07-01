package camp.java.project4;

import java.util.Random;

public class SetBranch {
	static boolean draw = false;
	static int [] branch = new int[MainFrame.branchNum]; //사용할 branch
	
	public SetBranch() {
		for(int i=0; i<MainFrame.branchNum; i++) {
			Random rand = new Random();
			branch[i] = rand.nextInt(10)%(MainFrame.num-1);
		}
		draw = true;
		LadderPanel ladderPanel = new LadderPanel();
		ladderPanel.repaint();
	}
}
