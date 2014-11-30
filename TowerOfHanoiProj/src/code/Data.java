package code;

import java.util.ArrayList;
import java.util.Iterator;

public class Data {
	
	ArrayList<Integer> m_StickDiskA;
	ArrayList<Integer> m_StickDiskB;
	ArrayList<Integer> m_StickDiskC;
	int m_NumOfManipulation = 0;
	
	// コンストラクター
	// 棒のリスト作成と初期円盤データを置く
	public Data( int diskNum ) {
		// 棒データの生成
		m_StickDiskA = new ArrayList<Integer>();
		m_StickDiskB = new ArrayList<Integer>();
		m_StickDiskC = new ArrayList<Integer>();
		
		// Aの棒に円盤データ（数値）を追加していく。
		for (int i = diskNum; i >= 1; i--) {
			m_StickDiskA.add(i);
		}		
	}
	
	// ある棒から目的の棒へ円盤データを移動するメソッド
	public void diskMove(ArrayList<Integer> fromStick, ArrayList<Integer> destStick)
	{
		// 目的の棒に円盤データを追加 
		destStick.add(fromStick.get(fromStick.size()-1));
		// 元の棒の円盤データを削除
		fromStick.remove(fromStick.size()-1);
		inclementManipulationTimes();
	}
	
	private void inclementManipulationTimes()
	{
		m_NumOfManipulation++;
	}
}
