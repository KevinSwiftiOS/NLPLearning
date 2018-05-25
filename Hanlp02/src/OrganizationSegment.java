import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

public class OrganizationSegment {
//用户需要手动开启机构名称识别
	public static void main(String[] args) {
		// TODO AutoString[] testCase = new String[]{
	    String testCase[] = new String[]{"我在上海林原科技有限公司兼职工作，",
	    "我经常在台川喜宴餐厅吃饭，",
	    "偶尔去地中海影城看电影。",
	};
	Segment segment = HanLP.newSegment().enableOrganizationRecognize(true);
	for (String sentence : testCase)
	{
	    List<Term> termList = segment.seg(sentence);
	    System.out.println(termList);
	}

	}

}
