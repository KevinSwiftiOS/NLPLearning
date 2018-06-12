   # -*- coding: utf-8 -*-

from numpy import *
import numpy as np
from Nbayes_lib import *


dataSet,listClasses = loadDataSet() #导入外部数据集
nb = NBayes()                       #类的实例化
nb.train_set(dataSet,listClasses)   #训练数据集
nb.map2vocab(dataSet[2])           #随机选择一个测试句，这里2表示文本中的第三句话，不是脏话，应输出0。
print (nb.predict(nb.testset))     #输出分类结果