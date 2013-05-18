package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.BookOnlineInfo;
import cn.edu.ustb.dm.model.BookOnlineInfoExample;
import cn.edu.ustb.dm.model.BookOnlineInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookOnlineInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int countByExample(BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int deleteByExample(BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int deleteByPrimaryKey(Integer book_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int insert(BookOnlineInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int insertSelective(BookOnlineInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    List<BookOnlineInfoWithBLOBs> selectByExampleWithBLOBs(BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    List<BookOnlineInfo> selectByExample(BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    BookOnlineInfoWithBLOBs selectByPrimaryKey(Integer book_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByExampleSelective(@Param("record") BookOnlineInfoWithBLOBs record, @Param("example") BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByExampleWithBLOBs(@Param("record") BookOnlineInfoWithBLOBs record, @Param("example") BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByExample(@Param("record") BookOnlineInfo record, @Param("example") BookOnlineInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByPrimaryKeySelective(BookOnlineInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByPrimaryKeyWithBLOBs(BookOnlineInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_online_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    int updateByPrimaryKey(BookOnlineInfo record);
}