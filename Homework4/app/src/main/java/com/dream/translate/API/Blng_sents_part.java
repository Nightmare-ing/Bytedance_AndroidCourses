/**
  * Copyright 2021 bejson.com 
  */
package com.dream.translate.API;
import java.util.List;

/**
 * Auto-generated: 2021-11-08 13:51:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Blng_sents_part {

    private int sentence_count;
    private List<Sentence_pair> sentence_pair;
    private String more;
    private List<Trs_classify> trs_classify;
    public void setSentence_count(int sentence_count) {
         this.sentence_count = sentence_count;
     }
     public int getSentence_count() {
         return sentence_count;
     }

    public void setSentence_pair(List<Sentence_pair> sentence_pair) {
         this.sentence_pair = sentence_pair;
     }
     public List<Sentence_pair> getSentence_pair() {
         return sentence_pair;
     }

    public void setMore(String more) {
         this.more = more;
     }
     public String getMore() {
         return more;
     }

    public void setTrs_classify(List<Trs_classify> trs_classify) {
         this.trs_classify = trs_classify;
     }
     public List<Trs_classify> getTrs_classify() {
         return trs_classify;
     }

}