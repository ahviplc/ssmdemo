package com.question.mapper;

import com.question.pojo.Ordergive;
import com.question.pojo.OrdergiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdergiveMapper {
    int countByExample(OrdergiveExample example);

    int deleteByExample(OrdergiveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ordergive record);

    int insertSelective(Ordergive record);

    List<Ordergive> selectByExample(OrdergiveExample example);

    Ordergive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ordergive record, @Param("example") OrdergiveExample example);

    int updateByExample(@Param("record") Ordergive record, @Param("example") OrdergiveExample example);

    int updateByPrimaryKeySelective(Ordergive record);

    int updateByPrimaryKey(Ordergive record);
}