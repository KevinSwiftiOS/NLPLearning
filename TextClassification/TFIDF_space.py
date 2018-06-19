#!/usr/bin/env python
# -*- coding: UTF-8 -*-
from sklearn.datasets.base import  Bunch;
from sklearn.feature_extraction.text import  TfidfVectorizer;
from Tools  import readFile,readBunchObj,writeBunchObj;
def vector_space(stopword_path, bunch_path, space_path, train_tfidf_path=None):
    stpwrdlst = readFile(stopword_path).splitlines()
    bunch = readBunchObj(bunch_path)
    tfidfspace = Bunch(target_name=bunch.target_name, label=bunch.label, filenames=bunch.filenames, tdm=[],
                       vocabulary={})

    if train_tfidf_path is not None:
        trainbunch = readBunchObj(train_tfidf_path)
        tfidfspace.vocabulary = trainbunch.vocabulary
        vectorizer = TfidfVectorizer(stop_words=stpwrdlst, sublinear_tf=True, max_df=0.5,
                                     vocabulary=trainbunch.vocabulary)
        tfidfspace.tdm = vectorizer.fit_transform(bunch.contents)

    else:
        vectorizer = TfidfVectorizer(stop_words=stpwrdlst, sublinear_tf=True, max_df=0.5)
        tfidfspace.tdm = vectorizer.fit_transform(bunch.contents)
        tfidfspace.vocabulary = vectorizer.vocabulary_

    writeBunchObj(space_path, tfidfspace)
    print("if-idf词向量空间实例创建成功！！！")


if __name__ == '__main__':
    stopword_path = "/Users/hcnucai/Desktop/FuDan/train_word_bag/hlt_stop_words.txt";
    bunch_path = "/Users/hcnucai/Desktop/FuDan/train_word_bag/train_set.dat";
    space_path = "/Users/hcnucai/Desktop/FuDan/train_word_bag/tfdifspace.dat";
    vector_space(stopword_path,bunch_path,space_path);
    bunch_path = "/Users/hcnucai/Desktop/FuDan/test_word_bag/test_set.dat";
    space_path = "/Users/hcnucai/Desktop/FuDan/test_word_bag/testspace.dat";
    train_tfidf_path = "/Users/hcnucai/Desktop/FuDan/train_word_bag/tfdifspace.dat";
    vector_space(stopword_path,bunch_path,space_path,train_tfidf_path);
