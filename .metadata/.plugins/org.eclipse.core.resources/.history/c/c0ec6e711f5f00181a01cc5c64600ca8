import  com.hankcs.hanlp.*;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.Dijkstra.DijkstraSegment;
import com.hankcs.hanlp.seg.NShort.NShortSegment;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.IndexTokenizer;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(HanLP.segment("你好，欢迎使用HanLP！"));
		  //标准分词
		  List<Term> termList = StandardTokenizer.segment("商品和服务");
		  System.out.println(termList);
	     //NLP分词
		  System.out.println(NLPTokenizer.segment("我新造一个词叫幻想乡你能识别并标注正确词性吗？"));
		  System.out.println(NLPTokenizer.analyze("我的希望是希望张晚霞的背影被晚霞映红").translateLabels());
		  System.out.println(NLPTokenizer.analyze("支援臺灣正體香港繁體：微软公司於1975年由比爾·蓋茲和保羅·艾倫創立。")
				  );
		  List<Term> List = IndexTokenizer.segment("主副食品");
		  for (Term term:List){
			  System.out.println(term + "[" + term.offset + ":" + (term.offset + term.length()) + "]");
		  }
		  //N最短路径分词
		  Segment nShortSegment = new NShortSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
		//最短路分词
		  Segment shortestSegment = new DijkstraSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
		  String[] testCase = new String[]{
				  "今天，刘志军案的关键人物,山西女商人丁书苗在市二中院出庭受审。",
			        "刘喜杰石国祥会见吴亚琴先进事迹报告团成员",
		  };
		  for (String sentence:testCase){
			  System.out.println("N-最短分词" + nShortSegment.seg(sentence) + "\n最短路分词：" +
		   shortestSegment.seg(sentence));
		  }
	
	}

}
