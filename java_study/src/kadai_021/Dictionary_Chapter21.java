package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//英単語の辞書として機能する
	HashMap<String, String> dictionaryMap = new HashMap<String,String>();

    // コンストラクタで辞書データを追加
    public Dictionary_Chapter21() {
        dictionaryMap.put("apple", "りんご");
        dictionaryMap.put("peach", "桃");
        dictionaryMap.put("banana", "バナナ");
        dictionaryMap.put("lemon", "レモン");
        dictionaryMap.put("pear", "梨");
        dictionaryMap.put("kiwi", "キウイ");
        dictionaryMap.put("strawberry", "いちご");
        dictionaryMap.put("grape", "ぶどう");
        dictionaryMap.put("muscat", "マスカット");
        dictionaryMap.put("cherry", "さくらんぼ");
    }
	

    // 辞書を調べるメソッド
    public void dictionarySearch(String[] words) {

        for (int i = 0; i < words.length; i++) {

            if (dictionaryMap.containsKey(words[i])) {

                System.out.println(
                    words[i] + "の意味は"
                    + dictionaryMap.get(words[i])
                );

            } else {

                System.out.println(
                    words[i] + "は辞書に存在しません"
                );
            }
        }
    }
}
