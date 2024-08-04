package com.strategypp;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Meu App Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JLabel selectedOptionLabel = new JLabel("Olá, escolha o dia da semana!");

            String[] options = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
            JComboBox<String> comboBox = new JComboBox<>(options);
            ShowDay sd = new ShowDay();
            comboBox.addActionListener(e -> {
                String selectedOption = (String) comboBox.getSelectedItem();
                sd.setDiaSemanaWithString(selectedOption);
                selectedOptionLabel.setText("Selecionado: " + sd.showDay());
            });

            JPanel panel = new JPanel();

            panel.add(comboBox);
            panel.add(selectedOptionLabel);
            frame.add(panel);

            frame.setVisible(true);
        });
    }
}