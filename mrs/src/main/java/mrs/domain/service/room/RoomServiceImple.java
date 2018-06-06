package mrs.domain.service.room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.mapper.MeetingRoomMapper;
import mrs.domain.mapper.ReservableRoomMapper;
import mrs.domain.model.ReservableRoomKey;

@Service
//メソッドが正常終了した場合はコミット　実行時例外が発生した場合はロールバック
@Transactional
public class RoomServiceImple implements RoomService {

    @Autowired
    ReservableRoomMapper reservableRoomMapper;

    @Autowired
    MeetingRoomMapper meetingRoomMapper;

    public List<ReservableRoomKey> findReserableRooms(LocalDate date) {
        //TODO : 実装

        meetingRoomMapper.selectByPrimaryKey(1L);

        return new ArrayList<ReservableRoomKey>();
    }
}
