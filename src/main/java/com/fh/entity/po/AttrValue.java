package com.fh.entity.po;

public class AttrValue {

    private  Integer id;

    private  String value;

    private  String valueCH;

    private  Integer attrId;

    private int isdel;

    public int getIsdel() {
        return isdel;
    }

    public void setIsdel(int isdel) {
        this.isdel = isdel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueCH() {
        return valueCH;
    }

    public void setValueCH(String valueCH) {
        this.valueCH = valueCH;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }
}
