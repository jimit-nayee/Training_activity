package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.example.demo.Model.Member;
import com.example.demo.repo.MemberRepo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.List;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
class TestingApplicationTests {

	 @Autowired
	    private MockMvc mockMvc;
	 
	 @MockBean
	 MemberRepo mr;
    
	 @Test
    public void testHome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/home"))
                .andExpect(status().isOk());
    }
	 
	 @Test
	 public void testRepo() throws Exception{
//		 List<Member> li = mr.getMembers();
//		 System.out.println(li);
//		 assertEquals(2, li.size());
		 when(mr.getMemberByEmail("j@n.com")).thenReturn(new Member("j@n.com","jimit","8293156","male"));
	 }

//	    @Test
//	    void negativeController() throws Exception{
//	    	mockMvc.perform(MockMvcRequestBuilders.get("/index"))
//	    			.andExpect(status().isNotFound());
//	    }
//	    
//	    @Test
//	    void checkValue() throws Exception{
//	    	mockMvc.perform(MockMvcRequestBuilders.get("/index"))
//			.andExpect(content().string(containsString("hi")));
//	    }
}
