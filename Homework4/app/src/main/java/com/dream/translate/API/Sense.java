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
public class Sense {

    private List<String> examples;
    private List<String> def;
    private String cat;
    public void setExamples(List<String> examples) {
         this.examples = examples;
     }
     public List<String> getExamples() {
         return examples;
     }

    public void setDef(List<String> def) {
         this.def = def;
     }
     public List<String> getDef() {
         return def;
     }

    public void setCat(String cat) {
         this.cat = cat;
     }
     public String getCat() {
         return cat;
     }

}