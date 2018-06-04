package mrs.domain.service.room.imple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.mapper.ReservableRoomMapper;
import mrs.domain.model.ReservableRoomKey;
import mrs.domain.service.room.RoomService;

@Service
//メソッドが正常終了した場合はコミット　実行時例外が発生した場合はロールバック
@Transactional
public class RoomServiceImple implements RoomService {

    @Autowired
    ReservableRoomMapper reservableRoomMapper;

    public List<ReservableRoomKey> findReserableRooms(LocalDate date) {
        //TODO : 実装
        return new ArrayList<ReservableRoomKey>();
    }
}
