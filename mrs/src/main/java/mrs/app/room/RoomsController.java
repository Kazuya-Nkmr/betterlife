package mrs.app.room;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mrs.domain.service.room.RoomService;

@Controller
@RequestMapping("rooms")
public class RoomsController {
    @Autowired
    RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    String listRooms(Model model) {
        LocalDate today = LocalDate.now();
        roomService.findReserableRooms(today);
        return "room/listRooms";
    }
}
