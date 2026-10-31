package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
		
	public void setGivenName() {
		givenName = "太郎";
	}
	
	//スーパークラスの個別の自己紹介eachIntroduceをオーバーライドして
	//メソッドを再定義する	
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
