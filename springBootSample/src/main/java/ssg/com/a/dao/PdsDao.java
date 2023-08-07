package ssg.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import ssg.com.a.dto.PdsDto;

@Mapper
@Repository
public interface PdsDao {

	List<PdsDto> pdslist();
	
	int uploadPds(PdsDto pds);
	
	PdsDto getPds(int seq);
	
	int updatePds(PdsDto pds);
}
