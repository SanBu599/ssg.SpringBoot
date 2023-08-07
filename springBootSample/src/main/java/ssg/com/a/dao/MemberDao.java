package ssg.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import ssg.com.a.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {

	int idcheck(String id);
	
	int addmember(MemberDto mem);
	
	MemberDto login(MemberDto mem);
}