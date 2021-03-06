package mrs.domain.mapper;

import java.util.List;
import mrs.domain.model.Usr;
import mrs.domain.model.UsrExample;
import org.apache.ibatis.annotations.Param;

public interface UsrMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    long countByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int deleteByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int insert(Usr record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int insertSelective(Usr record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    List<Usr> selectByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    Usr selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int updateByPrimaryKeySelective(Usr record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table usr
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    int updateByPrimaryKey(Usr record);
}