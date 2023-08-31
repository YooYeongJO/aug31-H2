package com.jose1593.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper // mapper는 interface로 
public interface BoardDAO {

	List<Map<String, Object>> list();

}
