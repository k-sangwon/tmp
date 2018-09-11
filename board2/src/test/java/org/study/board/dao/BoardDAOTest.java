package org.study.board.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.board.model.Board;

import junit.framework.Assert;
/**
 * ��޼���
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = 
	{ "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {

	@Autowired
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception {
		Board board = new Board();
		board.setTitle("������ �����ӿ�ũ");
		board.setContent("������ MVC");
		board.setWriter("���۰����ڵ���");
		
		dao.create(board);
	}
	
	@Test
	public void testRead() throws Exception {
		Board board = dao.read(26);
		
		Assert.assertEquals("���۰����ڵ���", board.getWriter());
		
		board = dao.read(40);
		Assert.assertNull(board);
	}
	
	@Test
	public void testUpdate() throws Exception {
		Board board = dao.read(24);
		board.setTitle("������ ����");
		board.setContent("������ ����");
		
		dao.update(board);
	}
	
	@Test
	public void testListAll() throws Exception {
		List<Board> list = dao.listAll();
		
		Assert.assertEquals(7, list.size());
	}
}
