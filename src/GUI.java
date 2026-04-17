import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GUI {

    private BookingService service = new BookingService();
    private DefaultTableModel model;

    public GUI() {

        JFrame frame = new JFrame("Meeting Room Booking System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        model = new DefaultTableModel(new String[]{"ID","Room","Date","Time","Email"},0);
        JTable table = new JTable(model);

        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panel = new JPanel();

        JButton add = new JButton("Add");
        JButton delete = new JButton("Delete");
        JButton update = new JButton("Update");
        JButton refresh = new JButton("Refresh");

        panel.add(add);
        panel.add(delete);
        panel.add(update);
        panel.add(refresh);

        frame.add(panel, BorderLayout.SOUTH);

        add.addActionListener(e -> {
            String room = JOptionPane.showInputDialog("Room");
            String date = JOptionPane.showInputDialog("Date");
            String time = JOptionPane.showInputDialog("Time");
            String email = JOptionPane.showInputDialog("Email");

            service.add(room, date, time, email);
            refreshTable();
        });

        delete.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("ID");
            service.delete(Integer.parseInt(id));
            refreshTable();
        });

        update.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("ID");
            String room = JOptionPane.showInputDialog("New Room");
            service.update(Integer.parseInt(id), room);
            refreshTable();
        });

        refresh.addActionListener(e -> refreshTable());

        refreshTable();

        frame.setVisible(true);
    }

    private void refreshTable() {
        model.setRowCount(0);

        for (Booking b : service.getAll()) {
            model.addRow(new Object[]{
                    b.getId(),
                    b.getRoom(),
                    b.getDate(),
                    b.getTime(),
                    b.getEmail()
            });
        }
    }
}