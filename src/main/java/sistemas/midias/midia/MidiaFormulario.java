package sistemas.midias.midia;

import javax.swing.*;
import java.awt.*;

public class MidiaFormulario {

    public static Midias criarMidiaFormulario(){
        JTextField tituloField = new JTextField(20);
        JTextField generoField = new JTextField(20);
        JTextField anoField = new JTextField(4);
        JTextField descricaoField = new JTextField(60);
        JTextField elencoField = new JTextField(60);
        JTextField diretorField = new JTextField(20);

        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.add(new JLabel("Titulo"));
        panel.add(tituloField);
        panel.add(new JLabel("Genero"));
        panel.add(generoField);
        panel.add(new JLabel("Ano de Lançamento"));
        panel.add(anoField);
        panel.add(new JLabel("Descrição"));
        panel.add(descricaoField);
        panel.add(new JLabel("Elenco"));
        panel.add(elencoField);
        panel.add(new JLabel("Diretor"));
        panel.add(diretorField);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Confirme os dados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION){
            String titulo = tituloField.getText();
            String genero = generoField.getText();
            int ano = Integer.parseInt(anoField.getText());
            String descricao = descricaoField.getText();
            String [] elenco = elencoField.getText().split(",");
            String diretor = diretorField.getText();

            return new Midias(titulo, genero, ano, descricao, elenco, diretor);
        }
        return null;
    }
}
