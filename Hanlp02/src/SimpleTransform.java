import com.hankcs.hanlp.HanLP;

public class SimpleTransform {
	 public static void main(String[] args)
	    {
	        System.out.println(HanLP.convertToTraditionalChinese("用笔记本电脑写程序"));
	        System.out.println(HanLP.convertToSimplifiedChinese("「以後等妳當上皇后，就能買士多啤梨慶祝了」"));
	    }
}
