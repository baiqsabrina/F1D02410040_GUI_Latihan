import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// TOP-LEVEL CONTAINER CLASS: JFrame
public class MainFrame extends JFrame {
    private final InputPanel inputPanel = new InputPanel();
    private final ResultPanel resultPanel = new ResultPanel();
    private final ButtonPanel buttonPanel = new ButtonPanel();
    private final JLabel statusLabel = new JLabel("Silakan isi data.", SwingConstants.CENTER);

    public MainFrame() {
        super("Eksplorasi GUI Swing");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        // LAYOUT CLASS 1: BorderLayout
        setLayout(new BorderLayout(10, 10));
        add(statusLabel, BorderLayout.NORTH);

        // kotak Hasil diletakkan tepat di bawah form (Nama & NIM)
        JPanel tengah = new JPanel(new BorderLayout());
        tengah.add(inputPanel, BorderLayout.NORTH);
        tengah.add(resultPanel, BorderLayout.CENTER);
        add(tengah, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // EVENT LISTENER (Interface): override actionPerformed
        buttonPanel.getSapaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = inputPanel.getNama();
                String nim = inputPanel.getNim();
                if (nama.isEmpty() || nim.isEmpty()) {
                    statusLabel.setText("Nama dan NIM tidak boleh kosong!");
                } else {
                    String sapa = "Halo, " + nama + " (" + nim + ")!";
                    statusLabel.setText(sapa);
                    resultPanel.tambahSapa(sapa);
                }
            }
        });

        // EVENT LISTENER (Interface): override actionPerformed
        buttonPanel.getResetButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPanel.clear();
                resultPanel.clear();
                statusLabel.setText("Form direset.");
            }
        });

        // EVENT LISTENER (Event Adapter Class): override windowClosing
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int pilihan = JOptionPane.showConfirmDialog(
                        MainFrame.this, "Yakin ingin keluar?", "Konfirmasi",
                        JOptionPane.YES_NO_OPTION);
                if (pilihan == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
    }
}
