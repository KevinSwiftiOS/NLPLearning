import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLSentence;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLWord;

//依存语法分析
public class DemoDependencyParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CoNLLSentence sentence = HanLP.parseDependency("徐先生还具体帮助他确定了把画雄鹰、松鼠和麻雀作为主攻目标。");
	System.out.println(sentence);
	//进行遍历
	for(CoNLLWord word:sentence){
		System.out.printf("%s --(%s)--> %s\n",word.LEMMA,word.DEPREL,word.HEAD.LEMMA);
	}
	//拿到数组后 任意顺序或者逆序遍历
	CoNLLWord wordArray[] = sentence.getWordArray();
	 for (int i = wordArray.length - 1; i >= 0; i--)
     {
         CoNLLWord word = wordArray[i];
         System.out.printf("%s --(%s)--> %s\n", word.LEMMA, word.DEPREL, word.HEAD.LEMMA);
     }
	 //直接遍历子树 从某棵子树的某个节点一路遍历到虚根
	 CoNLLWord head = wordArray[12];
	 while((head = head.HEAD) != null){
		 if(head == CoNLLWord.ROOT)
			 System.out.println(head.LEMMA);
		 else
			 System.out.printf("%s --(%s)--> ", head.LEMMA, head.DEPREL);
	 }
	}

}
