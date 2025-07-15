package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	// フィールド：辞書（英単語→日本語の意味）
	private HashMap<String, String> dictionary;

	// コンストラクタ：辞書を初期化し、英単語と意味を登録
	public Dictionary_Chapter21() {
		dictionary = new HashMap<>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	// 検索メソッド：引数の単語が辞書にあれば意味を返す。なければnullを返す。
	public String search(String word) {
		return dictionary.get(word); // 見つからない場合はnullを返す
	}
}
