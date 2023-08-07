package ssg.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssg.com.a.dao.BbsDao;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;

@Service
@Transactional
public class BbsService {

	@Autowired
	BbsDao dao;
	
	public List<BbsDto> bbslist(BbsParam param) {
		return dao.bbslist(param);
	}
	
	public int getallbbs(BbsParam param) {
		return dao.getallbbs(param);
	}
	
	public int bbswrite(BbsDto bbs) {
		return dao.bbswrite(bbs);
	}
	
	public BbsDto bbsdetail(int seq) {
		return dao.bbsdetail(seq);
	}
	
	public int bbsAnswer(BbsDto bbs) {
		dao.bbsAnswerUpdate(bbs);
		return dao.bbsAnswerInsert(bbs);
	}
}


