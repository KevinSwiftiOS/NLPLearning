#进行预测分类
from sklearn.naive_bayes import  MultinomialNB;
from sklearn import metrics;
from Tools import  readBunchObj;
#导入训练集
trainPath = "/Users/hcnucai/Desktop/FuDan/train_word_bag/tfdifspace.dat";
train_set = readBunchObj(trainPath);
#导入测试集
testPath = "/Users/hcnucai/Desktop/FuDan/test_word_bag/testspace.dat";
test_set = readBunchObj(testPath);
#训练分类器 输入词袋向量和标签 alpha越小 迭代越多 精度越高
clf = MultinomialNB(alpha=0.001).fit(train_set.tdm, train_set.label)

# 预测分类结果
predicted = clf.predict(test_set.tdm)

for flabel, file_name, expct_cate in zip(test_set.label, test_set.filenames, predicted):
    if flabel != expct_cate:
        print(file_name, ": 实际类别:", flabel, " -->预测类别:", expct_cate)

print("预测完毕!!!")

#计算精度
def metrics_result(actual,predict):
    print("精度:{0:.3f}".format(metrics.precision_score(actual,predict,average='weighted')));
    print('召回:{0:0.3f}'.format(metrics.recall_score(actual, predict, average='weighted')))
    print('f1-score:{0:.3f}'.format(metrics.f1_score(actual, predict, average='weighted')))
metrics_result(test_set.label,predicted);