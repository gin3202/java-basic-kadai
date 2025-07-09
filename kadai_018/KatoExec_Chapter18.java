package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.familyName = "加藤";
		taro.address = "東京都";
		taro.setGivenName();
		taro.execIntroduce();

		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.familyName = "加藤";
		ichiro.address = "大阪府";
		ichiro.setGivenName();
		ichiro.execIntroduce();

		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.familyName = "加藤";
		hanako.address = "北海道";
		hanako.setGivenName();
		hanako.execIntroduce();
	}
}
