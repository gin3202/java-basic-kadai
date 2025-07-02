package kadai_015;

public class Car_Chapter15 {
	// フィールド
	private int gear = 1; // 初期ギアは1
	private int speed = 10; // 初期速度は10km/h

	// ギアチェンジメソッド
	public void gearChange(int afterGear) {
		this.gear = afterGear;

		// ギアに応じた速度設定
		switch (gear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
			break;
		}
	}

	// 走行メソッド：現在の速度を表示
	public void run() {
		System.out.println("現在の速度は " + speed + "km/h です。");
	}
}
