package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Controller {
	
	Data m_Data;
	Drawer m_Drawer;
	int m_DiskNum;
	
	// コンストラクター
	public Controller() {
    	m_DiskNum = askNumOfDisk();
    	m_Data = new Data(m_DiskNum);
    	m_Drawer = new Drawer();
    	m_Drawer.redraw(m_Data);
	}
	
	public void runHanoiAlg()
	{
		hanoi(m_DiskNum, m_Data.m_StickDiskA, m_Data.m_StickDiskC, m_Data.m_StickDiskB);
	}
	
	private void hanoi(int n, ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C)
	{
		if( n > 0 )
		{
			hanoi(n-1,A,C,B);
			m_Data.diskMove(A,B);
			waitEnterInput();
			m_Drawer.redraw(m_Data);
			hanoi(n-1,C,B,A);
		}
	}
	
	private void waitEnterInput()
	{
		String str = new String();
		
		BufferedReader console =
				new BufferedReader(new InputStreamReader(System.in), 1);  // データ入力の準備
		
		System.out.print("Enterを押してください。");
    	System.out.flush();         // 強制出力

    	try
    	{
    		str = console.readLine();    // 文字列の入力
    	}
    	catch(IOException e)
    	{
    		// 処理なし
    	}
	}
		
	private int askNumOfDisk()
	{
		String str = new String();
		int numOfDisk;
		
		BufferedReader console =
				new BufferedReader(new InputStreamReader(System.in), 1);  // データ入力の準備
		
		System.out.println("ハノイの塔の円盤の数を入力してください");
    	System.out.print(">");      // 画面出力
    	System.out.flush();         // 強制出力

    	try
    	{
    		str = console.readLine();    // 文字列の入力
    	}
    	catch(IOException e)
    	{
    		// 処理なし
    	}
    	numOfDisk = Integer.parseInt(str);
    	
    	return numOfDisk;
	}
}
