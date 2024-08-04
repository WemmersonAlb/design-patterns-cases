package com.decoratorpp;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Decorator Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();

        ImprimirNumero ip = new NumeroUm();
        JLabel campoImpressao = new JLabel(ip.imprimir());

        List<String> decoradores = new ArrayList<>();

        JCheckBox checkBoxParenteses = new JCheckBox("( )");
        JCheckBox checkBoxColchetes = new JCheckBox("[ ]");
        JCheckBox checkBoxChaves = new JCheckBox("{ }");

        // Método para atualizar a exibição do número decorado
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                ImprimirNumero resultado = ip;
                if (checkBoxParenteses.isSelected()) {   
                    if(!decoradores.contains("parenteses")){
                        decoradores.add("parenteses");
                    }               
                }else{
                    decoradores.remove("parenteses");
                }

                if (checkBoxColchetes.isSelected()) {  
                    if(!decoradores.contains("colchetes")){
                        decoradores.add("colchetes");
                    }                  
                }else{
                    decoradores.remove("colchetes");
                }

                if (checkBoxChaves.isSelected()) {
                    if(!decoradores.contains("chaves")){
                        decoradores.add("chaves");
                    }
                }else{
                    decoradores.remove("chaves");
                }
                
                for(String s : decoradores){
                    switch (s) {
                        case "parenteses":
                            resultado = new Parenteses(resultado);
                            break;
                        case "colchetes":
                            resultado = new Colchetes(resultado);
                            break;
                        case "chaves":
                            resultado = new Chaves(resultado);
                            break;
                    
                        default:
                            break;
                    }
                }
                campoImpressao.setText(resultado.imprimir());
            }
        };        

        checkBoxParenteses.addItemListener(listener);
        checkBoxColchetes.addItemListener(listener);
        checkBoxChaves.addItemListener(listener);

        panel.add(checkBoxParenteses);
        panel.add(checkBoxColchetes);
        panel.add(checkBoxChaves);
        panel.add(campoImpressao);

        frame.add(panel);

        frame.setVisible(true);
    }
    
}