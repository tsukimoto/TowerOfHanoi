package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm {
	
	Data m_Data;
	int m_DiskNum;
	
	// コンストラクター
	public Algorithm() {
    	m_DiskNum = askNumOfDisk();
    	
    	m_Data = new Data(m_DiskNum);
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
