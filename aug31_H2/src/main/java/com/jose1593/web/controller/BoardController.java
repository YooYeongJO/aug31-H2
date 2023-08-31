package com.jose1593.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jose1593.web.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String board(Model model) { // 화면에 띄워주려면 model 사용해야됨
		List<Map<String, Object>> list = boardService.list();
		System.out.println(list);
		model.addAttribute("list", list);
		return "board";
	}

}
