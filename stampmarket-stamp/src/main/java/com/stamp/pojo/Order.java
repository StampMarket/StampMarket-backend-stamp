package com.stamp.pojo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Date;

@Entity
@Table(name = "stamporder")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userid;
    private String tradedate;
    private Integer stampid;
    private Integer amount;

    public Order(Integer id, Integer userid, String tradedate, Integer stampid, Integer amount){
        this.id = id;
        this.userid = userid;
        this.tradedate = tradedate;
        this.stampid = stampid;
        this.amount = amount;
    }

    public Order() {

    }

    public Integer getId(){ return id;  }
    public void setId(Integer id){   this.id = id;  }
    public Integer getUserid(){return userid;}
    public void setUserid(Integer userid){this.userid = userid;}
    public String getTradedate(){return tradedate;}
    public void setTradedate(String tradedate){this.tradedate = tradedate;}
    public Integer getStampid(){return stampid;}
    public void setStampid(Integer stampid){this.stampid = stampid;}
    public Integer getAmount(){return amount;};
    public void setAmount(Integer amount){this.amount = amount;}


}
