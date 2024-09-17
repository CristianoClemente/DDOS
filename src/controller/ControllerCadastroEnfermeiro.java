package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.bo.Enfermeiro;
import view.CadastroEnfermeiro;

public class ControllerCadastroEnfermeiro implements ActionListener {

    CadastroEnfermeiro telaCadastroEnfermeiro;

    public ControllerCadastroEnfermeiro(CadastroEnfermeiro telaCadastroEnfermeiro) {

        this.telaCadastroEnfermeiro = telaCadastroEnfermeiro;

        this.telaCadastroEnfermeiro.getjButtonNovo().addActionListener(this);
        this.telaCadastroEnfermeiro.getjButtonCancelar().addActionListener(this);
        this.telaCadastroEnfermeiro.getjButtonGravar().addActionListener(this);
        this.telaCadastroEnfermeiro.getjButtonBuscar().addActionListener(this);
        this.telaCadastroEnfermeiro.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroEnfermeiro.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroEnfermeiro.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroEnfermeiro.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEnfermeiro.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroEnfermeiro.getjPanelDados());

            this.telaCadastroEnfermeiro.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroEnfermeiro.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEnfermeiro.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroEnfermeiro.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroEnfermeiro.getjButtonGravar()) {

            Enfermeiro enfermeiro = new Enfermeiro();

            enfermeiro.setLogin(this.telaCadastroEnfermeiro.getUsuarioField().getText());
            enfermeiro.setSenha(this.telaCadastroEnfermeiro.getSenhaField().getText());
            enfermeiro.setNomeSocial(this.telaCadastroEnfermeiro.getNomeField().getText());
            enfermeiro.setCoren(this.telaCadastroEnfermeiro.getCorenField().getText());
            enfermeiro.setStatus(this.telaCadastroEnfermeiro.getjComboStatus().getSelectedItem().toString());
            enfermeiro.setId(model.bo.ClasseDadosGravacao.listaEnfermeiros.size() + 1);
            enfermeiro.setNome(this.telaCadastroEnfermeiro.getNomeField().getText());
            enfermeiro.setFone1(this.telaCadastroEnfermeiro.getTelefone1Field().getText());
            enfermeiro.setFone2(this.telaCadastroEnfermeiro.getTelefone2Field().getText());
            enfermeiro.setEmail(this.telaCadastroEnfermeiro.getEmailField().getText());
            enfermeiro.setCpfCnpj(this.telaCadastroEnfermeiro.getCpfField().getText());
            enfermeiro.setRgInscricaoEstadual(this.telaCadastroEnfermeiro.getRgField().getText());
            enfermeiro.setDataCadastro(LocalDate.now());
            enfermeiro.setLogradouro(this.telaCadastroEnfermeiro.getLogradouroField().getText());
            enfermeiro.setComplemento(this.telaCadastroEnfermeiro.getComplementoField().getText());
            enfermeiro.setBairro(this.telaCadastroEnfermeiro.getBairroField().getText());
            enfermeiro.setCidade(this.telaCadastroEnfermeiro.getCidadeField().getText());
            enfermeiro.setCep(this.telaCadastroEnfermeiro.getCepField().getText());
            enfermeiro.setUf(this.telaCadastroEnfermeiro.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaEnfermeiros.add(enfermeiro);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroEnfermeiro.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroEnfermeiro.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroEnfermeiro.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaEnfermeiros.toString());
        } else if (evento.getSource() == this.telaCadastroEnfermeiro.getjButtonSair()) {
            this.telaCadastroEnfermeiro.dispose();
        }

    }

}
