package mrs.domain.service.room;

import java.time.LocalDate;
import java.util.List;

import mrs.domain.model.ReservableRoomKey;

public interface RoomService {
    List<ReservableRoomKey> findReserableRooms(LocalDate date);

}
