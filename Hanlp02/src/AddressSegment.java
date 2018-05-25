import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

public class AddressSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testCase = new String[]{
		        "武胜县新学乡政府大楼门前锣鼓喧天",
		        "蓝翔给宁夏固原市彭阳县红河镇黑牛沟村捐赠了挖掘机",
		};
		Segment segment = HanLP.newSegment().enablePlaceRecognize(true);
		for (String sentence : testCase)
		{
		    List<Term> termList = segment.seg(sentence);
		    System.out.println(termList);
		}
	}

}
