package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Member;

@Repository
public class MemberRepo {
	
	public List<Member> getMembers(){
		List<Member> li = new ArrayList<Member>();
		li.add(new Member("j@n.com","jimit","8293156","male"));
		li.add(new Member("s@c.com","sahil","3947423895","male"));
		li.add(new Member("p@p.com","prabhati","8293156634","female"));
		return li;
		
	}
	public Member getMemberByEmail(String mail) {
		return new Member("j@n.com","jimit","8293156","male");
	}
}
