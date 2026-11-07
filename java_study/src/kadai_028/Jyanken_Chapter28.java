package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	 //自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("じゃんけんの手を決めてください。グーは「r」、チョキは「s」、パーは「p」を入力してください。"
				);
		
		try {
			//じゃんけんを入力する
			String myChoice = scanner.next();
			
			//r / s / p 以外の時、案内を出す。
		    if (!myChoice.equals("r")
		            && !myChoice.equals("s")
		            && !myChoice.equals("p")) {
		    	
		    	//throwで例外処理を実行する。
		    	throw new IllegalArgumentException();		        
		    }
	
			
			//入力値を返す
			return myChoice;
		} catch (IllegalArgumentException e) {
			System.out.println("r・s・p のいずれかを入力してください。");
			System.exit(0) ;//エラーで終了とする。
		}
	    return null;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRamdom() {
		
		//配列へじゃんけんを格納する
		String[] choices = {"r", "s", "p"};
		
		//CAST処理で１～３の整数をランダムで生成する
		int index = (int)Math.floor(Math.random() * 3);
		
		return choices[index];
	}
	
	//じゃんけんを実施する
	public void playGame() {
		
		//入力したじゃんけんを保持
		String myChoice = getMyChoice();
		
		//生成された相手のじゃんけんを保持
		String cpuChoice = getRamdom();
		
	
		//HashMapの生成
		HashMap<String, String>handMap = new HashMap<String, String>();
		
		//HashMapへジャンケンのキーと値の格納
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		//お互いのじゃんけんを表示
		System.out.println("自分："+ handMap.get(myChoice));
		System.out.println("相手："+ handMap.get(cpuChoice));
		
		//あいこのとき
		if(myChoice.equals(cpuChoice)) {
			System.out.println("あいこです");
		//自分の勝ちのとき
		}else if((myChoice.equals("r") && cpuChoice.equals("s"))
                        || (myChoice.equals("s") && cpuChoice.equals("p"))
                        || (myChoice.equals("p") && cpuChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		//自分の負けたとき
		}else {
			System.out.println("自分の負けです");
		}
	}
	
}
