package camp.java.project4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MappingBranch {
	static int [] mapping; //target의 기준으로 name기준 
	int i, j;
	int temp;
	
	public MappingBranch() {
		setMapping();
	}
	void setMapping() {
		mapping = new int[MainFrame.num];
		for(i=0; i<MainFrame.num; i++) {
			mapping[i] = i;
		}
		for(i=0; i<MainFrame.branchNum; i++) {
			temp = mapping[SetBranch.branch[i]];
			mapping[SetBranch.branch[i]] = mapping[SetBranch.branch[i]+1];
			mapping[SetBranch.branch[i]+1] = temp;
			System.out.println("Mapping Result : " + Arrays.toString(mapping)); //mapping 결과 
		}
	}
}
