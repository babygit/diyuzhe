package com.qian.diyuzhe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.qian.diyuzhe.result.ResultProxy;
import com.qian.diyuzhe.service.ArticleService;

@Controller("articleController")
@RequestMapping("/client/article")
public class ArticleController {

	private Logger logger = LoggerFactory.getLogger("article");

	@Autowired
	private ArticleService articleService;

	/********
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getArticleList/{beginRow}/{pageSize}")
	public ResultProxy getArticleList(@PathVariable("beginRow") int beginRow, @PathVariable("beginRow") int pageSize) {
		logger.info("getArticleList|beginRow|" + beginRow + "|pageSize|" + pageSize);
		logger.info("getArticleList|articleService|" + JSON.toJSONString(articleService));
		return new ResultProxy();
	}

}
