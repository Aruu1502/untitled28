import java.util.*;

public class BookingService {

    private List<Booking> list;
    private FileManager fm = new FileManager();
    private int id = 1;

    public BookingService() {
        list = fm.load();

        if (!list.isEmpty()) {
            id = list.get(list.size() - 1).getId() + 1;
        }
    }

    public void add(String room, String date, String time, String email) {

        if (room.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("Invalid email");
            return;
        }

        Booking b = new Booking(id++, room, date, time, email);
        list.add(b);
        fm.save(list);
    }

    public void delete(int id) {
        list.removeIf(b -> b.getId() == id);
        fm.save(list);
    }

    public void update(int id, String newRoom) {
        for (Booking b : list) {
            if (b.getId() == id) {
                b.setRoom(newRoom);
            }
        }
        fm.save(list);
    }

    public List<Booking> getAll() {
        return list;
    }
}
