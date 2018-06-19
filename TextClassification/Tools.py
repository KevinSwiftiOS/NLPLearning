import pickle
#保存至文件
# 保存至文件
def saveFile(savepath, content):
    with open(savepath, "wb") as fp:
        fp.write(content)


# 读取文件
def readFile(path):
    with open(path, "rb") as fp:
        content = fp.read()
    return content


def writeBunchObj(path, bunchobj):
    with open(path, "wb") as file_obj:
        pickle.dump(bunchobj, file_obj)


# 读取bunch对象
def readBunchObj(path):
    with open(path, "rb") as file_obj:
        bunch = pickle.load(file_obj)
    return bunch