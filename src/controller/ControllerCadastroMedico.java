package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.bo.Medico;
import view.CadastroMedico;

public class ControllerCadastroMedico implements ActionListener {

    CadastroMedico telaCadastroMedico;

    public ControllerCadastroMedico(CadastroMedico telaCadastroMedico) {

        this.telaCadastroMedico = telaCadastroMedico;

        this.telaCadastroMedico.getjButtonNovo().addActionListener(this);
        this.telaCadastroMedico.getjButtonCancelar().addActionListener(this);
        this.telaCadastroMedico.getjButtonGravar().addActionListener(this);
        this.telaCadastroMedico.getjButtonBuscar().addActionListener(this);
        this.telaCadastroMedico.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroMedico.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroMedico.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroMedico.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroMedico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroMedico.getjPanelDados());

            this.telaCadastroMedico.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroMedico.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroMedico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroMedico.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroMedico.getjButtonGravar()) {

            Medico medico = new Medico();

            medico.setLogin(this.telaCadastroMedico.getUsuarioField().getText());
            medico.setSenha(this.telaCadastroMedico.getSenhaField().getText());
            medico.setNomeSocial(this.telaCadastroMedico.getNomeField().getText());
            medico.setCrm(this.telaCadastroMedico.getCrmField().getText());
            medico.setStatus(this.telaCadastroMedico.getjComboStatus().getSelectedItem().toString());
            medico.setId(model.bo.ClasseDadosGravacao.listaMedicos.size() + 1);
            medico.setNome(this.telaCadastroMedico.getNomeField().getText());
            medico.setFone1(this.telaCadastroMedico.getTelefone1Field().getText());
            medico.setFone2(this.telaCadastroMedico.getTelefone2Field().getText());
            medico.setEmail(this.telaCadastroMedico.getEmailField().getText());
            medico.setCpfCnpj(this.telaCadastroMedico.getCpfField().getText());
            medico.setRgInscricaoEstadual(this.telaCadastroMedico.getRgField().getText());
            medico.setDataCadastro(LocalDate.now());
            medico.setLogradouro(this.telaCadastroMedico.getLogradouroField().getText());
            medico.setComplemento(this.telaCadastroMedico.getComplementoField().getText());
            medico.setBairro(this.telaCadastroMedico.getBairroField().getText());
            medico.setCidade(this.telaCadastroMedico.getCidadeField().getText());
            medico.setCep(this.telaCadastroMedico.getCepField().getText());
            medico.setUf(this.telaCadastroMedico.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaMedicos.add(medico);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroMedico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroMedico.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroMedico.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaMedicos.toString());
        } else if (evento.getSource() == this.telaCadastroMedico.getjButtonSair()) {
            this.telaCadastroMedico.dispose();
        }

    }

}
