package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Ala;
import model.bo.ClasseDadosGravacao;
import view.CadastroAla;

public class AlaController implements ActionListener {

    CadastroAla cadastroAla;

    public AlaController(CadastroAla cadastroAla) {

        this.cadastroAla = cadastroAla;

        this.cadastroAla.getjButtonNovo().addActionListener(this);
        this.cadastroAla.getjButtonCancelar().addActionListener(this);
        this.cadastroAla.getjButtonGravar().addActionListener(this);
        this.cadastroAla.getjButtonBuscar().addActionListener(this);
        this.cadastroAla.getjButtonSair().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroAla.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroAla.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroAla.getjPanelDados());

            this.cadastroAla.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroAla.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroAla.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroAla.getjPanelDados());

        } else if (evento.getSource() == this.cadastroAla.getjButtonGravar()) {
            Ala ala = new Ala();

            ala.setId(model.bo.ClasseDadosGravacao.listaMedicamento.size() + 1);
            ala.setDescrcao(this.cadastroAla.getDescricaoField().getText());
            ala.getStatus(this.cadastroAla.getjComboStatus().getSelectedItem().toString());
            // medicamento.setQuantidadeMinima(this.telaCadastroMedicamento.getQtdMinField().getText());
            // Obs.: Note que só coloquei dois atribtos como exemplo
            //Deve-se colocar todos os dados da classe

            ClasseDadosGravacao.listaAlas.add(ala);

            utilities.Utilities.ativaDesativa(false, this.cadastroAla.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroAla.getjPanelDados());
        } else if (evento.getSource() == this.cadastroAla.getjButtonBuscar()) {
            JOptionPane.showMessageDialog(null, ClasseDadosGravacao.listaMedicamento.toString());
        }

    }

}
