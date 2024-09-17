package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.bo.Farmaceutico;
import view.CadastroFarmaceutico;

public class ControllerCadastroFarmaceutico implements ActionListener {

    CadastroFarmaceutico telaCadastroFarmaceutico;

    public ControllerCadastroFarmaceutico(CadastroFarmaceutico telaCadastroFarmaceutico) {

        this.telaCadastroFarmaceutico = telaCadastroFarmaceutico;

        this.telaCadastroFarmaceutico.getjButtonNovo().addActionListener(this);
        this.telaCadastroFarmaceutico.getjButtonCancelar().addActionListener(this);
        this.telaCadastroFarmaceutico.getjButtonGravar().addActionListener(this);
        this.telaCadastroFarmaceutico.getjButtonBuscar().addActionListener(this);
        this.telaCadastroFarmaceutico.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroFarmaceutico.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroFarmaceutico.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroFarmaceutico.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFarmaceutico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroFarmaceutico.getjPanelDados());

            this.telaCadastroFarmaceutico.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroFarmaceutico.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFarmaceutico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFarmaceutico.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroFarmaceutico.getjButtonGravar()) {

            Farmaceutico farmaceutico = new Farmaceutico();

            farmaceutico.setLogin(this.telaCadastroFarmaceutico.getUsuarioField().getText());
            farmaceutico.setSenha(this.telaCadastroFarmaceutico.getSenhaField().getText());
            farmaceutico.setNomeSocial(this.telaCadastroFarmaceutico.getNomeField().getText());
            farmaceutico.setCrf(this.telaCadastroFarmaceutico.getCrfField().getText());
            farmaceutico.setStatus(this.telaCadastroFarmaceutico.getjComboStatus().getSelectedItem().toString());
            farmaceutico.setId(model.bo.ClasseDadosGravacao.listaFarmaceuticos.size() + 1);
            farmaceutico.setNome(this.telaCadastroFarmaceutico.getNomeField().getText());
            farmaceutico.setFone1(this.telaCadastroFarmaceutico.getTelefone1Field().getText());
            farmaceutico.setFone2(this.telaCadastroFarmaceutico.getTelefone2Field().getText());
            farmaceutico.setEmail(this.telaCadastroFarmaceutico.getEmailField().getText());
            farmaceutico.setCpfCnpj(this.telaCadastroFarmaceutico.getCpfField().getText());
            farmaceutico.setRgInscricaoEstadual(this.telaCadastroFarmaceutico.getRgField().getText());
            farmaceutico.setDataCadastro(LocalDate.now());
            farmaceutico.setLogradouro(this.telaCadastroFarmaceutico.getLogradouroField().getText());
            farmaceutico.setComplemento(this.telaCadastroFarmaceutico.getComplementoField().getText());
            farmaceutico.setBairro(this.telaCadastroFarmaceutico.getBairroField().getText());
            farmaceutico.setCidade(this.telaCadastroFarmaceutico.getCidadeField().getText());
            farmaceutico.setCep(this.telaCadastroFarmaceutico.getCepField().getText());
            farmaceutico.setUf(this.telaCadastroFarmaceutico.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaFarmaceuticos.add(farmaceutico);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroFarmaceutico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFarmaceutico.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroFarmaceutico.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaLaboratorio.toString());
        } else if (evento.getSource() == this.telaCadastroFarmaceutico.getjButtonSair()) {
            this.telaCadastroFarmaceutico.dispose();
        }

    }
}
