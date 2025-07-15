package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 調べたい単語の配列
		String[] wordsToCheck = {
				"apple", "orange", "grape", "cherry", "melon"
		};

		// 辞書クラスのインスタンスを生成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 単語ごとに検索し、結果を表示
		for (String word : wordsToCheck) {
			String result = dictionary.search(word);
			if (result != null) {
				System.out.println(word + "の意味は" + result + "です。");
			} else {
				System.out.println(word + "は辞書に存在しません。");
			}
		}
	}
}
