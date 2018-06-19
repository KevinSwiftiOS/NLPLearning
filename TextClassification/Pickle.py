#pickle的使用 使用序列化 dump将python对象保存至文件中  load又可以从文件中读取出来
import pickle


obj = 123, "abcdedf", ["ac", 123], {"key": "value", "key1": "value1"}
print(obj)
#序列化到文件
with open("/Users/hcnucai/Desktop/pickle.rtf","r+") as fp:
    pickle.dump(obj,fp);