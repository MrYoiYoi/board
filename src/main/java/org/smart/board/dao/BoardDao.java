package org.smart.board.dao;

import org.apache.ibatis.annotations.Mapper;
import org.smart.board.entity.Board;

import java.util.List;

@Mapper
public interface BoardDao {
    public List<Board> findAll();
    public int insert(Board board);
    public int delete(Long boardseq);
    public int update(Board board);
    public Board findOne(Long boardseq);
    public int hitCount(Long boardseq);
}
