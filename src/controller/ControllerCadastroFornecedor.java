package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.bo.Fornecedor;
import view.CadastroFornecedor;

public class ControllerCadastroFornecedor implements ActionListener {

    CadastroFornecedor telaCadastroFornecedor;

    public ControllerCadastroFornecedor(CadastroFornecedor telaCadastroFornecedor) {

        this.telaCadastroFornecedor = telaCadastroFornecedor;

        this.telaCadastroFornecedor.getjButtonNovo().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonCancelar().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonGravar().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonBuscar().addActionListener(this);
        this.telaCadastroFornecedor.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.telaCadastroFornecedor.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPanelDados());

            this.telaCadastroFornecedor.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.telaCadastroFornecedor.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroFornecedor.getjButtonGravar()) {

            Fornecedor fornecedor = new Fornecedor();

            fornecedor.setNomeFantasia(this.telaCadastroFornecedor.getNomeField().getText());
            fornecedor.setStatus(this.telaCadastroFornecedor.getjComboStatus().getSelectedItem().toString());
            fornecedor.setId(model.bo.ClasseDadosGravacao.listaFornecedores.size() + 1);
            fornecedor.setContato(this.telaCadastroFornecedor.getContatoField().getText());
            fornecedor.setFone1(this.telaCadastroFornecedor.getTelefone1Field().getText());
            fornecedor.setFone2(this.telaCadastroFornecedor.getTelefone2Field().getText());
            fornecedor.setEmail(this.telaCadastroFornecedor.getEmailField().getText());
            fornecedor.setCpfCnpj(this.telaCadastroFornecedor.getCnpjField().getText());
            fornecedor.setDataCadastro(LocalDate.now());
            fornecedor.setLogradouro(this.telaCadastroFornecedor.getLogradouroField().getText());
            fornecedor.setComplemento(this.telaCadastroFornecedor.getComplementoField().getText());
            fornecedor.setBairro(this.telaCadastroFornecedor.getBairroField().getText());
            fornecedor.setCidade(this.telaCadastroFornecedor.getCidadeField().getText());
            fornecedor.setCep(this.telaCadastroFornecedor.getCepField().getText());
            fornecedor.setUf(this.telaCadastroFornecedor.getUfField().getText());

            model.bo.ClasseDadosGravacao.listaFornecedores.add(fornecedor);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanelDados());

        } else if (evento.getSource() == this.telaCadastroFornecedor.getjButtonBuscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaLaboratorio.toString());
        } else if (evento.getSource() == this.telaCadastroFornecedor.getjButtonSair()) {
            this.telaCadastroFornecedor.dispose();
        }

    }
}
