import javax.swing.*;
import java.awt.*;

// INTERMEDIATE CONTAINER CLASS: JPanel dengan border berjudul "Hasil"
public class ResultPanel extends JPanel {
    // ATOMIC COMPONENT: JTextArea (di dalam JScrollPane)
    private final JTextArea hasilArea = new JTextArea();

    public ResultPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(0, 20, 0, 20),
                BorderFactory.createTitledBorder("Hasil")));
        hasilArea.setEditable(false);
        hasilArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(new JScrollPane(hasilArea), BorderLayout.CENTER);
    }

    // simpan hasil sapa (setiap klik Sapa ditambah satu baris)
    public void tambahSapa(String teks) {
        hasilArea.append(teks + "\n");
    }

    public void clear() {
        hasilArea.setText("");
    }
}
