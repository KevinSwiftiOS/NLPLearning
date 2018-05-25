import com.hankcs.hanlp.mining.word2vec.DocVectorModel;
import com.hankcs.hanlp.mining.word2vec.WordVectorModel;

//演示词向量的训练与应用
public class DemoWord2Vec {

//	  public static void main(String[] args) throws IOException
//	    {
//	        WordVectorModel wordVectorModel = trainOrLoadModel();
//	        printNearest("中国", wordVectorModel);
//	        printNearest("美丽", wordVectorModel);
//	        printNearest("购买", wordVectorModel);
//
//	        // 文档向量
//	        DocVectorModel docVectorModel = new DocVectorModel(wordVectorModel);
//	        String[] documents = new String[]{
//	            "山东苹果丰收",
//	            "农民在江苏种水稻",
//	            "奥运会女排夺冠",
//	            "世界锦标赛胜出",
//	            "中国足球失败",
//	        };
//
//	        System.out.println(docVectorModel.similarity(documents[0], documents[1]));
//	        System.out.println(docVectorModel.similarity(documents[0], documents[4]));
//
//	        for (int i = 0; i < documents.length; i++)
//	        {
//	            docVectorModel.addDocument(i, documents[i]);
//	        }
//
//	        printNearestDocument("体育", documents, docVectorModel);
//	        printNearestDocument("农业", documents, docVectorModel);
//	        printNearestDocument("我要看比赛", documents, docVectorModel);
//	        printNearestDocument("要不做饭吧", documents, docVectorModel);
//	    }

}
