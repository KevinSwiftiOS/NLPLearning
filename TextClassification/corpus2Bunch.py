import os;
import pickle;
from  sklearn.datasets.base import  Bunch;
from Tools import  readFile;
def corpus2Bunch(wordbag_path,seg_path):
    #获取seg_path下的所有子目录 也就是分类信息
    cateList = os.listdir(seg_path);
    #创建Bunch实例
    bunch = Bunch(target_name=[], label=[], filenames=[], contents=[])
    bunch.target_name.extend(cateList)
    '''
      extend(addlist)是python list中的函数，意思是用新的list（addlist）去扩充
      原来的list
      '''
    #获取每个目录下的所有文件
    for mydir in cateList:
        class_path = seg_path + mydir + "/";
        #获取文件
        file_list = os.listdir(class_path);
        for file_path in file_list:
            #文件名字
            file_name = class_path + file_path;
            bunch.label.append(mydir);
            bunch.filenames.append(file_name);
            bunch.contents.append(readFile(file_name));
    #将bunch存到word+path路径中
    with open(wordbag_path,"wb") as file_obj:
        pickle.dump(bunch,file_obj);
    print("构建文本结束")


if __name__ == "__main__":
    #对训练集进行Bunch化操作
    wordbag_path = "/Users/hcnucai/Desktop/FuDan/train_word_bag/train_set.dat";
    seg_path = "/Users/hcnucai/Desktop/FuDan/train_corpus_seg/"
    corpus2Bunch(wordbag_path,seg_path);
    #对训练集进行同等操作
    wordbag_path = "/Users/hcnucai/Desktop/FuDan/test_word_bag/test_set.dat";
    seg_path = "/Users/hcnucai/Desktop/FuDan/test_corpus_seg/"
    corpus2Bunch(wordbag_path, seg_path);