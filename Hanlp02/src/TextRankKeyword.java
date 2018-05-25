import java.util.List;

import com.hankcs.hanlp.HanLP;

//关键词的提取
public class TextRankKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String content = "程序员(英文Programmer)是从事程序开发、维护的专业人员。一般将程序员分为程序设计人员和程序编码人员，但两者的界限并不非常清楚，特别是在中国。软件从业人员分为初级程序员、高级程序员、系统分析员和项目经理四大类。";
//提取了5个关键词	
List<String> keywordList = HanLP.extractKeyword(content, 5);
System.out.println(keywordList);
	}

}
