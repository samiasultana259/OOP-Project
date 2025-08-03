package App;

import javax.swing.SwingUtilities;
import ui.BirthdayReminderUI;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BirthdayReminderUI app = new BirthdayReminderUI();
            app.setVisible(true);
        });
    }
}