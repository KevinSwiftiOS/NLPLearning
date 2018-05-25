import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

//音译人名识别
public class TranscriptionSegment {
	
 public static void main(String args[]){
	 String testCase[] = new String[]{
			  "一桶冰水当头倒下，微软的比尔盖茨、Facebook的扎克伯格跟桑德博格、亚马逊的贝索斯、苹果的库克全都不惜湿身入镜，这些硅谷的科技人，飞蛾扑火似地牺牲演出，其实全为了慈善。",
              "世界上最长的姓名是简森·乔伊·亚历山大·比基·卡利斯勒·达夫·埃利奥特·福克斯·伊维鲁莫·马尔尼·梅尔斯·帕特森·汤普森·华莱士·普雷斯顿。",
	 };
	 Segment segment = HanLP.newSegment().enableTranslatedNameRecognize(true);
	 //for 循环 循环变量类型 循环变量名称 要遍历的对象
	 for(String ses:testCase){
		 List<Term> termList = segment.seg(ses);
		 System.out.println(termList);
	 }
 }
}
