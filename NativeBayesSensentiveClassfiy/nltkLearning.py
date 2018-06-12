import nltk;
from bs4 import BeautifulSoup;
import urllib.request;
from nltk.corpus import stopwords;
from nltk.tokenize import sent_tokenize;
nltk.download();
#抓取网页内容 随后进行解析

response = urllib.request.urlopen("http://php.net/");
html = response.read();

#利用beautifulSoup清洗文字
soup = BeautifulSoup(html,"html5lib");
text = soup.get_text(strip=True);
#将文本转为tokens
#token化过程意味着将大的部件分割为小部件。 利用nltk中的tokenize

tokens = text.split();
#统计token的频率分布

mytext = "Hello Adam, how are you? I hope everything is going well. Today is a good day, see you dude."
print(sent_tokenize(mytext));
#处理停用词 获取英文停用词
stopwords.words('english');
clean_tokens = list();
stopWrods = stopwords.words('english');
for token in tokens:
    if not token in stopwords:
     clean_tokens.append(token);
freq = nltk.FreqDist(clean_tokens);
for key,val in freq.items():
    print(str(key) + ":" + str(val));
#调用plot函数画出频率分布图
freq.plot(20,cumulative = False);