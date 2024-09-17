package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.bo.Laboratorio;
import view.CadastroLaboratorio;

public class ControllerCadastroLaboratorio implements ActionListener {

    CadastroLaboratorio telaCadastroLaboratorio;

    public ControllerCadastroLaboratorio(CadastroLaboratorio telaCadastroLaboratorio) {

        this.telaCadastroLaboratorio = telaCadastroLaboratorio;

        this.telaCadastroLaboratorio.getjButtonNovo().addActionListener(this);
        this.telaCadastroLaboratorio.getjButtonCancelar().addActionListener(this);
        this.telaCadastroLaboratorio.getjButtonGravar().addActionListener(this);
        this.telaCadastroLaboratorio.getjButtonBuscar().addActionListener(this);
        this.telaCadastroLaboratorio.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroLaboratorio.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroLaboratorio.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroLaboratorio.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroLaboratorio.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroLaboratorio.getjPanelDados());

            this.telaCadastroLaboratorio.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroLaboratorio.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroLaboratorio.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroLaboratorio.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroLaboratorio.getjButtonGravar()) {

            Laboratorio laboratorio = new Laboratorio();

            laboratorio.setNomeFantasia(this.telaCadastroLaboratorio.getNomeField().getText());
            laboratorio.setStatus(this.telaCadastroLaboratorio.getjComboStatus().getSelectedItem().toString());
            laboratorio.setId(model.bo.ClasseDadosGravacao.listaLaboratorio.size() + 1);
            laboratorio.setContato(this.telaCadastroLaboratorio.getContatoField().getText());
            laboratorio.setFone1(this.telaCadastroLaboratorio.getTelefone1Field().getText());
            laboratorio.setFone2(this.telaCadastroLaboratorio.getTelefone2Field().getText());
            laboratorio.setEmail(this.telaCadastroLaboratorio.getEmailField().getText());
            laboratorio.setCpfCnpj(this.telaCadastroLaboratorio.getCnpjField().getText());
            laboratorio.setDataCadastro(LocalDate.now());
            laboratorio.setLogradouro(this.telaCadastroLaboratorio.getLogradouroField().getText());
            laboratorio.setComplemento(this.telaCadastroLaboratorio.getComplementoField().getText());
            laboratorio.setBairro(this.telaCadastroLaboratorio.getBairroField().getText());
            laboratorio.setCidade(this.telaCadastroLaboratorio.getCidadeField().getText());
            laboratorio.setCep(this.telaCadastroLaboratorio.getCepField().getText());
            laboratorio.setUf(this.telaCadastroLaboratorio.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaLaboratorio.add(laboratorio);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroLaboratorio.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroLaboratorio.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroLaboratorio.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaLaboratorio.toString());
        } else if (evento.getSource() == this.telaCadastroLaboratorio.getjButtonSair()) {
            this.telaCadastroLaboratorio.dispose();
        }

    }

}
