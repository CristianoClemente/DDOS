package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.ClasseDadosGravacao;
import model.bo.Medicamento;
import view.TelaCadastroMedicamento;

public class ControllerCadastroMedicamento implements ActionListener {

    TelaCadastroMedicamento telaCadastroMedicamento;

    public ControllerCadastroMedicamento(TelaCadastroMedicamento telaCadastroMedicamento) {

        this.telaCadastroMedicamento = telaCadastroMedicamento;

        this.telaCadastroMedicamento.getjButtonNovo().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonCancelar().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonGravar().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonBuscar().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonSair().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroMedicamento.getjButtonNovo()) {

        } else if (e.getSource() == this.telaCadastroMedicamento.getjButtonSair()) {

        } else if (e.getSource() == this.telaCadastroMedicamento.getjButtonGravar()) {
            Medicamento medicamento = new Medicamento();

            medicamento.setId(model.bo.ClasseDadosGravacao.listaMedicamento.size() + 1);
            medicamento.setDescricaoMeiamento(this.telaCadastroMedicamento.getDescricaoField().getText());
            medicamento.setPrincipioAtivo(this.telaCadastroMedicamento.getPrincipioField().getText());
            // medicamento.setQuantidadeMinima(this.telaCadastroMedicamento.getQtdMinField().getText());
            // Obs.: Note que só coloquei dois atribtos como exemplo
            //Deve-se colocar todos os dados da classe

            ClasseDadosGravacao.listaMedicamento.add(medicamento);
        } else if (e.getSource() == this.telaCadastroMedicamento.getjButtonBuscar()) {
            JOptionPane.showMessageDialog(null, ClasseDadosGravacao.listaMedicamento.toString());
        }

    }

}
