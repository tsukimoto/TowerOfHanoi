package code;

import java.util.ArrayList;

public class Drawer {
	
	ArrayList<Integer> m_StickDiskA;
	ArrayList<Integer> m_StickDiskB;
	ArrayList<Integer> m_StickDiskC;
	int m_DiskNum;
	
	public Drawer(ArrayList<Integer> stickDiskA, ArrayList<Integer> stickDiskB, 
			ArrayList<Integer> stickDiskC) {
		this.m_StickDiskA = stickDiskA;
		this.m_StickDiskB = stickDiskB;
		this.m_StickDiskC = stickDiskC;
		
		this.m_DiskNum = m_StickDiskA.size();
	}
	
	public void redraw()
	{
		// 操作回数の表示を行う
		System.out.println();
		
		int heightOfStick = m_DiskNum + 1;
		
		for (int i = 0; i < heightOfStick; i++) {
			
		}
		System.out.println(" |  |  |");
		System.out.println(" |  |  |");
		System.out.println(" |  |  |");
	}
}
