package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String address;

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
