public class Booking {
    private int id;
    private String room;
    private String date;
    private String time;
    private String email;

    public Booking(int id, String room, String date, String time, String email) {
        this.id = id;
        this.room = room;
        this.date = date;
        this.time = time;
        this.email = email;
    }

    public int getId() { return id; }
    public String getRoom() { return room; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getEmail() { return email; }

    public void setRoom(String room) { this.room = room; }

    public String toFile() {
        return id + "," + room + "," + date + "," + time + "," + email;
    }
}