package com.fh.entity.po;

import java.util.Date;

public class Brand {

    private  Integer id;

    private  String name;

    private  String nameCH;

    private Integer typeId;

    private Integer type;

    private Integer isSKU;

    private Integer isdel;

    private Date createDate;

    private Date updateDate;

    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCH() {
        return nameCH;
    }

    public void setNameCH(String nameCH) {
        this.nameCH = nameCH;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsSKU() {
        return isSKU;
    }

    public void setIsSKU(Integer isSKU) {
        this.isSKU = isSKU;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
