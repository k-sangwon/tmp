package org.study.board.dao;

import java.util.List;

import org.study.board.model.Board;

public interface BoardDAO {
	
	public void create(Board board) throws Exception;
	
	public Board read(Integer bno) throws Exception;
	
	public void update(Board board) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<Board> listAll() throws Exception;
}