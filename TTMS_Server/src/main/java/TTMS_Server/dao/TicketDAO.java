package TTMS_Server.dao;

import TTMS_Server.model.Ticket;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TicketDAO {
    //根据id获取
    @Select("select * from  ticket where ticket_id = #{id}")
    Ticket selectTicketById(Long id);

    //增加
    @Insert("insert into ticket (seat_id , sched_id , ticket_price , ticket_status ," +
            "ticket_locked_time) values (#{seat_id} , #{sched_id} , #{ticket_price} , " +
            "#{ticket_status} , #{ticket_locked_time})")
    void addTicket(Ticket ticket);

    //删除
    @Delete("delete from ticket where ticket_id = #{id}")
    void deleteTicketById(Long id);

    //更新
    @Update("update ticket set seat_id = #{seat_id} , sched_id = #{sched_id} , " +
            "ticket_price = #{ticket_price} , ticket_status = #{ticket_status} , " +
            "ticket_locked_time = #{ticket_locked_time} where ticket_id = #{ticket_id}")
    void  updateTicketById(Ticket ticket);


}
