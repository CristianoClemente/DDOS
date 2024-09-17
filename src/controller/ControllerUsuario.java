
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.bo.Usuario;
import view.CadastroUsuario;

public class ControllerUsuario implements ActionListener{
   
    CadastroUsuario telaCadastroUsuario;

    public ControllerUsuario (CadastroUsuario telaCadastroUsuario) {

        this.telaCadastroUsuario = telaCadastroUsuario;

        this.telaCadastroUsuario.getjButtonNovo().addActionListener(this);
        this.telaCadastroUsuario.getjButtonCancelar().addActionListener(this);
        this.telaCadastroUsuario.getjButtonGravar().addActionListener(this);
        this.telaCadastroUsuario.getjButtonBuscar().addActionListener(this);
        this.telaCadastroUsuario.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroUsuario.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroUsuario.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroUsuario.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroUsuario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroUsuario.getjPanelDados());

            this.telaCadastroUsuario.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroUsuario.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroUsuario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroUsuario.getjPanelDados());
            this.telaCadastroUsuario.getIdField().disable();

        } else if (evento.getSource() == this.telaCadastroUsuario.getjButtonGravar()) {

            Usuario usuario = new Usuario();

            usuario.setNomeSocial(this.telaCadastroUsuario.getNomeField().getText());
            usuario.setStatus(this.telaCadastroUsuario.getjComboStatus().getSelectedItem().toString());
            usuario.setId(model.bo.ClasseDadosGravacao.listaPacientes.size() + 1);
            usuario.setNome(this.telaCadastroUsuario.getNomeField().getText());
            usuario.setFone1(this.telaCadastroUsuario.getTelefone1Field().getText());
            usuario.setFone2(this.telaCadastroUsuario.getTelefone2Field().getText());
            usuario.setEmail(this.telaCadastroUsuario.getEmailField().getText());
            usuario.setCpfCnpj(this.telaCadastroUsuario.getCpfField().getText());
            usuario.setRgInscricaoEstadual(this.telaCadastroUsuario.getRgField().getText());
            usuario.setDataCadastro(LocalDate.now());
            usuario.setLogradouro(this.telaCadastroUsuario.getLogradouroField().getText());
            usuario.setComplemento(this.telaCadastroUsuario.getComplementoField().getText());
            usuario.setBairro(this.telaCadastroUsuario.getBairroField().getText());
            usuario.setCidade(this.telaCadastroUsuario.getCidadeField().getText());
            usuario.setCep(this.telaCadastroUsuario.getCepField().getText());
            usuario.setUf(this.telaCadastroUsuario.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaUsuarios.add(usuario);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroUsuario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroUsuario.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroUsuario.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaUsuarios.toString());
        } else if (evento.getSource() == this.telaCadastroUsuario.getjButtonSair()) {
            this.telaCadastroUsuario.dispose();
        }
    } 
}
