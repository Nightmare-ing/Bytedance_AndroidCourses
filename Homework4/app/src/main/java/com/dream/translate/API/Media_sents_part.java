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
public class Media_sents_part {

    private String query;
    private List<Sent> sent;
    public void setQuery(String query) {
         this.query = query;
     }
     public String getQuery() {
         return query;
     }

    public void setSent(List<Sent> sent) {
         this.sent = sent;
     }
     public List<Sent> getSent() {
         return sent;
     }

}