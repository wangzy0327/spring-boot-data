package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

//    @Select("select id,department_name from department where id = #{id}")
    public Department getDeptById(Integer id);

//    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

//    @Insert("insert into department(department_name) values(#{departmentName})")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertDept(Department department);

//    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);



}
