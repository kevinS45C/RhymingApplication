import java.util.HashMap;
// import java.util.Map;
public class Vowel {
    public void vowelContainer(String[] keyword){
        HashMap<String,String> vowelBox = new HashMap<>();
        vowelBox.put("あ", "A");
        vowelBox.put("い", "I");
        vowelBox.put("う", "U");
        vowelBox.put("え", "E");
        vowelBox.put("お", "O");
        vowelBox.put("か", "A");
        vowelBox.put("き", "I");
        vowelBox.put("く", "U");
        vowelBox.put("け", "E");
        vowelBox.put("こ", "O");
        vowelBox.put("さ", "A");
        vowelBox.put("し", "I");
        vowelBox.put("す", "U");
        vowelBox.put("せ", "E");
        vowelBox.put("そ", "O");
        vowelBox.put("た", "A");
        vowelBox.put("ち", "I");
        vowelBox.put("つ", "U");
        vowelBox.put("て", "E");
        vowelBox.put("と", "O");
        vowelBox.put("な", "A");
        vowelBox.put("に", "I");
        vowelBox.put("ぬ", "U");
        vowelBox.put("ね", "E");
        vowelBox.put("の", "O");
        vowelBox.put("は", "A");
        vowelBox.put("ひ", "I");
        vowelBox.put("ふ", "U");
        vowelBox.put("へ", "E");
        vowelBox.put("ほ", "O");
        vowelBox.put("ま", "A");
        vowelBox.put("み", "I");
        vowelBox.put("む", "U");
        vowelBox.put("め", "E");
        vowelBox.put("も", "O");
        vowelBox.put("や", "A");
        vowelBox.put("ゆ", "U");
        vowelBox.put("よ", "O");
        vowelBox.put("ら", "A");
        vowelBox.put("り", "I");
        vowelBox.put("る", "U");
        vowelBox.put("れ", "E");
        vowelBox.put("ろ", "O");
        vowelBox.put("わ", "A");
        vowelBox.put("を", "O");
        vowelBox.put("ん", "N");
        vowelBox.put("が", "A");
        vowelBox.put("ぎ", "I");
        vowelBox.put("ぐ", "U");
        vowelBox.put("げ", "E");
        vowelBox.put("ご", "O");
        vowelBox.put("ざ", "A");
        vowelBox.put("じ", "I");
        vowelBox.put("ず", "U");
        vowelBox.put("ぜ", "E");
        vowelBox.put("ぞ", "O");
        vowelBox.put("だ", "A");
        vowelBox.put("ぢ", "I");
        vowelBox.put("づ", "U");
        vowelBox.put("で", "E");
        vowelBox.put("ど", "O");
        vowelBox.put("ば", "A");
        vowelBox.put("び", "I");
        vowelBox.put("ぶ", "U");
        vowelBox.put("べ", "E");
        vowelBox.put("ぼ", "O");
        vowelBox.put("ぱ", "A");
        vowelBox.put("ぴ", "I");
        vowelBox.put("ぷ", "U");
        vowelBox.put("ぺ", "E");
        vowelBox.put("ぽ", "O");
        vowelBox.put("ゃ", "A");
        vowelBox.put("ゅ", "U");
        vowelBox.put("ょ", "O");
        vowelBox.put("ア", "A");
        vowelBox.put("イ", "I");
        vowelBox.put("ウ", "U");
        vowelBox.put("エ", "E");
        vowelBox.put("オ", "O");
        vowelBox.put("カ", "A");
        vowelBox.put("キ", "I");
        vowelBox.put("ク", "U");
        vowelBox.put("ケ", "E");
        vowelBox.put("コ", "O");
        vowelBox.put("サ", "A");
        vowelBox.put("シ", "I");
        vowelBox.put("ス", "U");
        vowelBox.put("セ", "E");
        vowelBox.put("ソ", "O");
        vowelBox.put("タ", "A");
        vowelBox.put("チ", "I");
        vowelBox.put("ツ", "U");
        vowelBox.put("テ", "E");
        vowelBox.put("ト", "O");
        vowelBox.put("ナ", "A");
        vowelBox.put("ニ", "I");
        vowelBox.put("ヌ", "U");
        vowelBox.put("ネ", "E");
        vowelBox.put("ノ", "O");
        vowelBox.put("ハ", "A");
        vowelBox.put("ヒ", "I");
        vowelBox.put("フ", "U");
        vowelBox.put("ヘ", "E");
        vowelBox.put("ホ", "O");
        vowelBox.put("マ", "A");
        vowelBox.put("ミ", "I");
        vowelBox.put("ム", "U");
        vowelBox.put("メ", "E");
        vowelBox.put("モ", "O");
        vowelBox.put("ヤ", "A");
        vowelBox.put("ユ", "U");
        vowelBox.put("ヨ", "O");
        vowelBox.put("ラ", "A");
        vowelBox.put("リ", "I");
        vowelBox.put("ル", "U");
        vowelBox.put("レ", "E");
        vowelBox.put("ロ", "O");
        vowelBox.put("ワ", "A");
        vowelBox.put("ヲ", "O");
        vowelBox.put("ン", "N");
        vowelBox.put("ガ", "A");
        vowelBox.put("ギ", "I");
        vowelBox.put("グ", "U");
        vowelBox.put("ゲ", "E");
        vowelBox.put("ゴ", "O");
        vowelBox.put("ザ", "A");
        vowelBox.put("ジ", "I");
        vowelBox.put("ズ", "U");
        vowelBox.put("ゼ", "E");
        vowelBox.put("ゾ", "O");
        vowelBox.put("ダ", "A");
        vowelBox.put("ヂ", "I");
        vowelBox.put("ヅ", "U");
        vowelBox.put("デ", "E");
        vowelBox.put("ド", "O");
        vowelBox.put("バ", "A");
        vowelBox.put("ビ", "I");
        vowelBox.put("ブ", "U");
        vowelBox.put("ベ", "E");
        vowelBox.put("ボ", "O");
        vowelBox.put("パ", "A");
        vowelBox.put("ピ", "I");
        vowelBox.put("プ", "U");
        vowelBox.put("ペ", "E");
        vowelBox.put("ポ", "O");
        vowelBox.put("ャ", "A");
        vowelBox.put("ュ", "U");
        vowelBox.put("ョ", "O");
        vowelBox.put("ー", "-");
        for(int i=0;i<keyword.length;i++){
            System.out.print(vowelBox.get(keyword[i]));
        }
    }
    // public void vowelSearch(String[] keyword){
    //     for(int i=0;i<keyword.length;i++){
    //         System.out.print(vowelBox.get(keyword[i]));
    //     }
    // }

}