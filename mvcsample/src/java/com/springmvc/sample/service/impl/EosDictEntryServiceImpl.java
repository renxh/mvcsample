package com.springmvc.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.sample.dao.EosDictEntryDao;
import com.springmvc.sample.entity.EosDictEntry;
import com.springmvc.sample.entity.EosDictEntryKey;
import com.springmvc.sample.service.EosDictEntryService;

@Service
@Transactional
public class EosDictEntryServiceImpl implements EosDictEntryService {
	@Autowired
	private EosDictEntryDao eosDictEntryDao;

	public EosDictEntry selectByPrimaryKey(EosDictEntryKey key) {
		EosDictEntry eosDictEntry = eosDictEntryDao.selectByPrimaryKey(key);
		return eosDictEntry;
	}

	public int updateByPrimaryKeySelective(EosDictEntry record) {
		int count = eosDictEntryDao.updateByPrimaryKeySelective(record);
		return count;
	}

}
