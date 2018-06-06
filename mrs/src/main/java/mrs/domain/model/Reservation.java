package mrs.domain.model;

import java.util.Date;

public class Reservation {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column reservation.reservation_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    private Long reservationId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column reservation.end_time
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    private Date endTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column reservation.start_time
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    private Date startTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column reservation.reserved_date
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    private Date reservedDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column reservation.room_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    private Integer roomId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column reservation.user_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column reservation.reservation_id
     * @return  the value of reservation.reservation_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public Long getReservationId() {
        return reservationId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column reservation.reservation_id
     * @param reservationId  the value for reservation.reservation_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column reservation.end_time
     * @return  the value of reservation.end_time
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column reservation.end_time
     * @param endTime  the value for reservation.end_time
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column reservation.start_time
     * @return  the value of reservation.start_time
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column reservation.start_time
     * @param startTime  the value for reservation.start_time
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column reservation.reserved_date
     * @return  the value of reservation.reserved_date
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public Date getReservedDate() {
        return reservedDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column reservation.reserved_date
     * @param reservedDate  the value for reservation.reserved_date
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public void setReservedDate(Date reservedDate) {
        this.reservedDate = reservedDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column reservation.room_id
     * @return  the value of reservation.room_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column reservation.room_id
     * @param roomId  the value for reservation.room_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column reservation.user_id
     * @return  the value of reservation.user_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column reservation.user_id
     * @param userId  the value for reservation.user_id
     * @mbg.generated  Thu Jun 07 08:01:30 JST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}