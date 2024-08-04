package com.observerpp;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
    public static void main(String[] args) {
        // Criação do frame principal
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Criação do painel
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        //Montagem da lógica
        SistemaMonitoramento sm = new SistemaMonitoramento();
        sm.setNomeSistema("PP Security");
        for(int i = 0 ; i<=5 ; i++){
            String tempNome = "a"+i;
            sm.addSensor(new Sensor(tempNome));
        }
        Delegacia d = new Delegacia(sm);
        Seguradora s = new Seguradora(sm);
        JLabel outSistemaDelegaciaSeguradora = new JLabel();

        // Criação do JCheckBox
        for(Sensor sensor : sm.getSensores()){
            String textSensor = sensor.getEstadoDisparado()?"Disparado":" - ";
            textSensor = sensor.getNome()+ " " + textSensor;
            JLabel labelSensor = new JLabel(textSensor);
            


            JCheckBox checkBox = new JCheckBox(sensor.getNome());
            checkBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e){
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        sensor.setEstadoDisparado(true);
                    } else {
                        sensor.setEstadoDisparado(false);
                    }
                    String textSensor = sensor.getEstadoDisparado()?"Disparado":" - ";
                    textSensor = sensor.getNome()+ " " + textSensor;
                    labelSensor.setText(textSensor);
                    outSistemaDelegaciaSeguradora.setText("<html>"+sm.display()+"<br>"+d.display()+"<br>"+s.display()+"</html>");                    
                }
            });
            panel.add(checkBox);
            panel2.add(labelSensor);
        }
        panel.add(outSistemaDelegaciaSeguradora);
        
        

        // Adição do painel ao frame
        frame.setLayout(new BorderLayout());
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Torna o frame visível
        frame.setVisible(true);
    }
    
}