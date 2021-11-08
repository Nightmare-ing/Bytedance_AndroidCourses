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
public class Web_translation {

    private String @same;
    private String key;
    private List<Trans> trans;
    public void set@same(String @same) {
         this.@same = @same;
     }
     public String get@same() {
         return @same;
     }

    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setTrans(List<Trans> trans) {
         this.trans = trans;
     }
     public List<Trans> getTrans() {
         return trans;
     }

}