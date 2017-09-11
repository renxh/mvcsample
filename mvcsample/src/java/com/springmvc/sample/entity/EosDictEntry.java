package com.springmvc.sample.entity;

public class EosDictEntry extends EosDictEntryKey {
    private String dictname;

    private Integer status;

    private Integer sortno;

    private Integer rank;

    private String parentid;

    private String seqno;

    private String filter1;

    private String filter2;

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getFilter1() {
        return filter1;
    }

    public void setFilter1(String filter1) {
        this.filter1 = filter1;
    }

    public String getFilter2() {
        return filter2;
    }

    public void setFilter2(String filter2) {
        this.filter2 = filter2;
    }
}