package com.qian.diyuzhe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qian.diyuzhe.dao.ArticleDao;
import com.qian.diyuzhe.service.ArticleService;

@Service
@Transactional(rollbackFor=Exception.class)
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
}
