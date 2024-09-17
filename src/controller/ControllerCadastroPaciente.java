package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;

import model.bo.Paciente;
import view.CadastroPaciente;

public class ControllerCadastroPaciente implements ActionListener {

    CadastroPaciente telaCadastroPaciente;

    public ControllerCadastroPaciente(CadastroPaciente telaCadastroPaciente) {

        this.telaCadastroPaciente = telaCadastroPaciente;

        this.telaCadastroPaciente.getjButtonNovo().addActionListener(this);
        this.telaCadastroPaciente.getjButtonCancelar().addActionListener(this);
        this.telaCadastroPaciente.getjButtonGravar().addActionListener(this);
        this.telaCadastroPaciente.getjButtonBuscar().addActionListener(this);
        this.telaCadastroPaciente.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroPaciente.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroPaciente.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroPaciente.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroPaciente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroPaciente.getjPanelDados());

            this.telaCadastroPaciente.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroPaciente.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroPaciente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroPaciente.getjPanelDados());
            this.telaCadastroPaciente.getIdField().disable();

        } else if (evento.getSource() == this.telaCadastroPaciente.getjButtonGravar()) {

            Paciente paciente = new Paciente();

            paciente.setNomesocial(this.telaCadastroPaciente.getNomeSocialField().getText());
            paciente.setStatus(this.telaCadastroPaciente.getjComboStatus().getSelectedItem().toString());
            paciente.setId(model.bo.ClasseDadosGravacao.listaPacientes.size() + 1);
            paciente.setNome(this.telaCadastroPaciente.getNomeField().getText());
            paciente.setFone1(this.telaCadastroPaciente.getTelefone1Field().getText());
            paciente.setFone2(this.telaCadastroPaciente.getTelefone2Field().getText());
            paciente.setEmail(this.telaCadastroPaciente.getEmailField().getText());
            paciente.setCpfCnpj(this.telaCadastroPaciente.getCpfField().getText());
            paciente.setRgInscricaoEstadual(this.telaCadastroPaciente.getRgField1().getText());
            paciente.setDataCadastro(LocalDate.now());
            paciente.setLogradouro(this.telaCadastroPaciente.getLogradouroField().getText());
            paciente.setComplemento(this.telaCadastroPaciente.getComplementoField().getText());
            paciente.setBairro(this.telaCadastroPaciente.getBairroField().getText());
            paciente.setCidade(this.telaCadastroPaciente.getCidadeField().getText());
            paciente.setCep(this.telaCadastroPaciente.getCepField().getText());
            paciente.setUf(this.telaCadastroPaciente.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaPacientes.add(paciente);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroPaciente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroPaciente.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroPaciente.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaPacientes.toString());
        } else if (evento.getSource() == this.telaCadastroPaciente.getjButtonSair()) {
            this.telaCadastroPaciente.dispose();
        }
    }

}
