package kadai_015;

public class Car_Chapter15 {
	// TODO 自動生成されたメソッド・スタブ
	private  int gear =  1; //1速から5速のギアを表す
	private int speed =  10; //ギアチェンジ後の速度を表す 
	
	//ギアの値により速度を変える
	public void changeGear(int afterGear) {
        this.gear = afterGear;

        // ギアに応じた速度を判定
        switch (this.gear) {
            case 10:
                this.speed = 10;
                break;
            case 20:
                this.speed = 20;
                break;
            case 30:
                this.speed = 30;
                break;
            case 40:
                this.speed = 40;
                break;
            case 50:
                this.speed = 50;
                break;
            default:
                // 1〜5以外のギアの場合は時速10km
                this.speed = 10;
                break;
        }
		
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
        System.out.println("速度は時速" + this.speed + "kmです。");
	}
}
