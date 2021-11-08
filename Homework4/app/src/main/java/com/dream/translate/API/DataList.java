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
public class DataList {

    private String pinyin;
    private List<Sense> sense;
    private String word;
    public void setPinyin(String pinyin) {
         this.pinyin = pinyin;
     }
     public String getPinyin() {
         return pinyin;
     }

    public void setSense(List<Sense> sense) {
         this.sense = sense;
     }
     public List<Sense> getSense() {
         return sense;
     }

    public void setWord(String word) {
         this.word = word;
     }
     public String getWord() {
         return word;
     }

}