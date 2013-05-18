package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.TagInfo;
import cn.edu.ustb.dm.model.TagInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int countByExample(TagInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int deleteByExample(TagInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int deleteByPrimaryKey(Integer TAG_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int insert(TagInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int insertSelective(TagInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    List<TagInfo> selectByExample(TagInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    TagInfo selectByPrimaryKey(Integer TAG_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByExampleSelective(@Param("record") TagInfo record, @Param("example") TagInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByExample(@Param("record") TagInfo record, @Param("example") TagInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByPrimaryKeySelective(TagInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByPrimaryKey(TagInfo record);
}