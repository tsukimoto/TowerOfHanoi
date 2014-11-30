package code;

import java.util.ArrayList;

public class Drawer {
	
	Data m_Data;
	int m_DiskNum;
		
	public void redraw(Data data)
	{
		this.m_Data = data;
		
		this.m_DiskNum = m_Data.m_StickDiskA.size() + m_Data.m_StickDiskB.size() + m_Data.m_StickDiskC.size();
		// 操作回数の表示を行う
		System.out.println("<" + m_Data.m_NumOfManipulation + "回目の操作>");
		
		int heightOfStick = m_DiskNum + 1;
		
		for (int i = 0; i < heightOfStick; i++) {
			System.out.print(" ");
			drawStep(i,heightOfStick);
			System.out.println("");
		}
	}
	
	private void drawStep(int step, int heightOfStick)
	{
		drawStepAorBorC(step, heightOfStick, m_Data.m_StickDiskA);
		System.out.print(" ");
		drawStepAorBorC(step, heightOfStick, m_Data.m_StickDiskB);
		System.out.print(" ");
		drawStepAorBorC(step, heightOfStick, m_Data.m_StickDiskC);
	}
	
	private void drawStepAorBorC(int step, int heightOfStick, ArrayList<Integer> stickDisk)
	{
		int drawNumber;
		int wideSize = (heightOfStick-1)*2-1;
		int drawTimes;
		int leftSpaceNumber;
		int rightSpaceNumber;
		
		if(stickDisk.size() >= (heightOfStick - step))
		{
			drawNumber = stickDisk.get(heightOfStick-step-1);
			drawTimes = drawNumber*2-1;
			leftSpaceNumber = (wideSize+1)/2-drawNumber;
			rightSpaceNumber = leftSpaceNumber;
			
			for(int i = 0; i < leftSpaceNumber; i++)
			{
				System.out.print(" ");
			}
			for(int i = 0; i < drawTimes; i++)
			{
				System.out.print(drawNumber);
			}
			for(int i = 0; i < rightSpaceNumber; i++)
			{
				System.out.print(" ");
			}
		}
		else
		{
			drawNumber = 1;
			drawTimes = drawNumber*2-1;
			leftSpaceNumber = (wideSize+1)/2-drawNumber;
			rightSpaceNumber = leftSpaceNumber;
			
			for(int i = 0; i < leftSpaceNumber; i++)
			{
				System.out.print(" ");
			}
			for(int i = 0; i < drawTimes; i++)
			{
				System.out.print("|");
			}
			for(int i = 0; i < rightSpaceNumber; i++)
			{
				System.out.print(" ");
			}			
		}
	}
}
