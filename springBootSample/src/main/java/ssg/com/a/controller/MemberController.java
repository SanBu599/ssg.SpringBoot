package ssg.com.a.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ssg.com.a.dto.MemberDto;
import ssg.com.a.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@PostMapping("/idcheck")
	public String idcheck(String id) {
		System.out.println("MemberController idcheck(String id)" + new Date());
		
		int count = service.idcheck(id);
		if(count==0) {
			return "YES";
		}
		return "NO";
	}
	
	@PostMapping("addmember")
	public String addmember(MemberDto mem) {
		System.out.println("MemberController addmember(MemberDto dto)" + new Date());
		
		int count = service.addmember(mem);
		if(count>0) {
			return "YES";
		}
		return "NO";
	}
	
	@PostMapping("login")
	public MemberDto login(MemberDto mem) {
		System.out.println("MemberController login(MemberDto dto)" + new Date());
		
		MemberDto dto = service.login(mem);
		if(dto!=null) {
			return dto;
		}
		return null;
	}
}
