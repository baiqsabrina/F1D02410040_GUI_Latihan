import javax.swing.*;
import java.awt.*;

// INTERMEDIATE CONTAINER: JPanel (form input)
public class InputPanel extends JPanel {
    // ATOMIC COMPONENTS: JLabel, JTextField
    private final JTextField namaField = new JTextField();
    private final JTextField nimField = new JTextField();

    public InputPanel() {
        // LAYOUT 2: GridLayout
        setLayout(new GridLayout(2, 2, 8, 8));
        setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        add(new JLabel("Nama:"));
        add(namaField);
        add(new JLabel("NIM:"));
        add(nimField);
    }

    public String getNama() { return namaField.getText().trim(); }
    public String getNim() { return nimField.getText().trim(); }

    public void clear() {
        namaField.setText("");
        nimField.setText("");
    }
}
