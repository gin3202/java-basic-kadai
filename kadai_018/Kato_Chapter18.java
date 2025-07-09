package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤"; // デフォルト姓
	public String givenName;
	public String address = "東京都"; // デフォルト住所

	public void commonIntroduce() {
		System.out.println("名前：" + familyName + " " + givenName);
		System.out.println("住所：" + address);
	}

	public abstract void eachIntroduce();

	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
}
