package com.lanjiao.gym.dao;

import com.lanjiao.gym.entity.ReservationDetails;

public interface ReservationDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reservation_details
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reservation_details
     *
     * @mbg.generated
     */
    int insert(ReservationDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reservation_details
     *
     * @mbg.generated
     */
    int insertSelective(ReservationDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reservation_details
     *
     * @mbg.generated
     */
    ReservationDetails selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reservation_details
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReservationDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reservation_details
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReservationDetails record);
}