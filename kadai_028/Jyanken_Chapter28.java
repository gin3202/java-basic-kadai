package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	private static final HashMap<String, String> handMap = new HashMap<>();
	static {
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
	}

	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice = "";

		while (true) {
			System.out.print("じゃんけんの手を入力してください（r：グー、s：チョキ、p：パー）＞ ");
			myChoice = scanner.nextLine().toLowerCase();

			if (handMap.containsKey(myChoice)) {
				break;
			} else {
				System.out.println("正しい入力をしてください（r, s, p のいずれか）");
			}
		}

		return myChoice;
	}

	// 対戦相手の手を乱数で選ぶ
	public String getRandom() {
		String[] hands = { "r", "s", "p" };
		Random rand = new Random();
		int index = (int) Math.floor(rand.nextDouble() * 3);
		return hands[index];
	}

	// じゃんけんを実行する
	public void playGame() {
		String myHand = getMyChoice();
		String opponentHand = getRandom();

		System.out.println("自分の手は " + handMap.get(myHand));
		System.out.println("相手の手は " + handMap.get(opponentHand));

		// 勝敗判定
		if (myHand.equals(opponentHand)) {
			System.out.println("あいこです");
		} else if ((myHand.equals("r") && opponentHand.equals("s")) ||
				(myHand.equals("s") && opponentHand.equals("p")) ||
				(myHand.equals("p") && opponentHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
