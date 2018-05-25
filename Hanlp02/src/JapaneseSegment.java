import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

//日本人名识别
public class JapaneseSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String testCase[] = new String[]{
		 "北川景子参演了林诣彬导演的《速度与激情3》",
	        "林志玲亮相网友:确定不是波多野结衣？",
};
Segment segment = HanLP.newSegment().enableJapaneseNameRecognize(true);
for(String ses:testCase){
	List<Term> termList = segment.seg(ses);
	System.out.println(termList);
}
	}

}
