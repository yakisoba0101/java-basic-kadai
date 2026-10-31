package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		givenName = "花子";
	}
	
	//スーパークラスの個別の自己紹介eachIntroduceをオーバーライドして
	//メソッドを再定義する	
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
