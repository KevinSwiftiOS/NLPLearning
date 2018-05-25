import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.collection.AhoCorasick.AhoCorasickDoubleArrayTrie;
import com.hankcs.hanlp.dictionary.CoreDictionary;
import com.hankcs.hanlp.dictionary.CustomDictionary;

//用户自定义词典的实现
public class DemoCustomDictionary {

	public static void main(String[] args) {
		// TODO Ato-generated method stub
     //动态添加
		CustomDictionary.add("攻城狮");
     //强行插入
		CustomDictionary.insert("白富美","nz 1024");
		//删除词语
	//	CustomDictionary.remove("攻城狮");
		System.out.println(CustomDictionary.add("单身狗","nz 1024 n 1"));
	  System.out.println(CustomDictionary.get("单身狗"));
	   String text = "攻城狮逆袭单身狗，迎娶白富美，走上人生巅峰";
	   final char[] charArray = text.toCharArray();
	   CustomDictionary.parseText(charArray,  new AhoCorasickDoubleArrayTrie.IHit<CoreDictionary.Attribute>(){;
	   @Override
	   public void hit(int begin,int end,CoreDictionary.Attribute value){
		   //输出在词中的位置
		  System.out.printf("[%d:%d] = %s %s\n",begin,end,new String(charArray, begin, end - begin),value);
		   
	   }
	   });
	   //自定义词典在所有分词器中都有效
	   System.out.print(HanLP.segment(text));
	}
}
