package com.springmvc.sample.dao;

import com.springmvc.sample.entity.EosDictEntry;
import com.springmvc.sample.entity.EosDictEntryKey;

public interface EosDictEntryDao {
    int deleteByPrimaryKey(EosDictEntryKey key);

    int insert(EosDictEntry record);

    int insertSelective(EosDictEntry record);

    EosDictEntry selectByPrimaryKey(EosDictEntryKey key);

    int updateByPrimaryKeySelective(EosDictEntry record);

    int updateByPrimaryKey(EosDictEntry record);
}
