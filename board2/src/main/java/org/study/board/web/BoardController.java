package org.study.board.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.study.board.dao.BoardDAO;
import org.study.board.model.Board;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	private BoardDAO dao;
	
	@RequestMapping("/list")
	public String listAll(Model model) {
		logger.info("/list was called");
		try {
			List<Board> list = dao.listAll();
			model.addAttribute("list", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "board/list";
	}
}