package com.springmvc.sample.service;

import com.springmvc.sample.entity.EosDictEntry;
import com.springmvc.sample.entity.EosDictEntryKey;

public interface EosDictEntryService {
	public EosDictEntry selectByPrimaryKey(EosDictEntryKey key);

	public int updateByPrimaryKeySelective(EosDictEntry record);

}
