package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroLaboratorio extends javax.swing.JDialog {

    public CadastroLaboratorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CadastroLaboratorio(JTextField EmailField, JTextField bairroField, JTextField cepField, JTextField cidadeField, JTextField cnpjField, JTextField complementoField, JTextField contatoField, JTextField idField, JButton jButtonBuscar, JButton jButtonCancelar, JButton jButtonGravar, JButton jButtonNovo, JButton jButtonSair, JComboBox<String> jComboStatus, JPanel jPanelBotoes, JPanel jPanelDados, JTextField logradouroField, JTextField nomeField, JTextField telefone1Field, JTextField telefone2Field, JTextField ufField) {
        this.EmailField = EmailField;
        this.bairroField = bairroField;
        this.cepField = cepField;
        this.cidadeField = cidadeField;
        this.cnpjField = cnpjField;
        this.complementoField = complementoField;
        this.contatoField = contatoField;
        this.idField = idField;
        this.jButtonBuscar = jButtonBuscar;
        this.jButtonCancelar = jButtonCancelar;
        this.jButtonGravar = jButtonGravar;
        this.jButtonNovo = jButtonNovo;
        this.jButtonSair = jButtonSair;
        this.jComboStatus = jComboStatus;
        this.jPanelBotoes = jPanelBotoes;
        this.jPanelDados = jPanelDados;
        this.logradouroField = logradouroField;
        this.nomeField = nomeField;
        this.telefone1Field = telefone1Field;
        this.telefone2Field = telefone2Field;
        this.ufField = ufField;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneltitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        nomeField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jComboStatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        contatoField = new javax.swing.JTextField();
        nomeSocialLabel = new javax.swing.JLabel();
        telefone1Field = new javax.swing.JTextField();
        telefone1Label = new javax.swing.JLabel();
        telefone2Field = new javax.swing.JTextField();
        telefone2Label = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        rgLabel = new javax.swing.JLabel();
        cnpjField = new javax.swing.JTextField();
        logradouroField = new javax.swing.JTextField();
        bairroField = new javax.swing.JTextField();
        cidadeField = new javax.swing.JTextField();
        nomeLabel8 = new javax.swing.JLabel();
        nomeLabel9 = new javax.swing.JLabel();
        nomeLabel10 = new javax.swing.JLabel();
        cepField = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        ComplementoLabel = new javax.swing.JLabel();
        complementoField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        ufField = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(617, 437));
        setResizable(false);

        jPaneltitulo.setBackground(new java.awt.Color(26, 70, 246));
        jPaneltitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Cadastro de Laboratório");
        jLabelTitulo.setToolTipText("");

        javax.swing.GroupLayout jPaneltituloLayout = new javax.swing.GroupLayout(jPaneltitulo);
        jPaneltitulo.setLayout(jPaneltituloLayout);
        jPaneltituloLayout.setHorizontalGroup(
            jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPaneltituloLayout.setVerticalGroup(
            jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanelBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setActionCommand("1");
        jButtonNovo.setMinimumSize(new java.awt.Dimension(67, 25));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelled.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setActionCommand("0");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(120, 30));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCancelar);

        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.setActionCommand("0");
        jButtonGravar.setEnabled(false);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonGravar);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("1");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonBuscar);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit (1).png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setActionCommand("1");
        jButtonSair.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonSair);

        jPanelDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        nomeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        nomeLabel.setText("Nome Fantasia");

        idLabel.setText("Id");

        jComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Cancelado" }));
        jComboStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStatusActionPerformed(evt);
            }
        });

        jLabel2.setText("Status");

        contatoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        contatoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoFieldActionPerformed(evt);
            }
        });

        nomeSocialLabel.setText("Contato");

        telefone1Field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        telefone1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1FieldActionPerformed(evt);
            }
        });

        telefone1Label.setText("Telefone 1");

        telefone2Field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        telefone2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone2FieldActionPerformed(evt);
            }
        });

        telefone2Label.setText("Telefone 2");

        EmailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("E-mail");

        rgLabel.setText("CNPJ");

        cnpjField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cnpjField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjFieldActionPerformed(evt);
            }
        });

        logradouroField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        logradouroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroFieldActionPerformed(evt);
            }
        });

        bairroField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        bairroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroFieldActionPerformed(evt);
            }
        });

        cidadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeFieldActionPerformed(evt);
            }
        });

        nomeLabel8.setText("Cidade");

        nomeLabel9.setText("Bairro");

        nomeLabel10.setText("Logradouro");

        cepField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cepField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepFieldActionPerformed(evt);
            }
        });

        cepLabel.setText("CEP");

        ComplementoLabel.setText("Complemento");

        complementoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        complementoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoFieldActionPerformed(evt);
            }
        });

        idField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        ufField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ufField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufFieldActionPerformed(evt);
            }
        });

        idLabel1.setText("UF");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                .addComponent(nomeField)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nomeSocialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(contatoField, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                        .addGap(13, 13, 13))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(ComplementoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(complementoField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(ufField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(nomeLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(logradouroField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefone1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefone1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefone2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefone2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailField)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(20, 20, 20))))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(nomeSocialLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contatoField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(rgLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(telefone2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(telefone1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeLabel9)
                            .addComponent(nomeLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(nomeLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logradouroField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(idLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ufField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cepLabel)
                                    .addComponent(ComplementoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(complementoField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPaneltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        utilities.Utilities.ativaDesativa(true, jPanelBotoes);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        utilities.Utilities.ativaDesativa(false, jPanelBotoes);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        utilities.Utilities.ativaDesativa(false, jPanelBotoes);
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void jComboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboStatusActionPerformed

    private void contatoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contatoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contatoFieldActionPerformed

    private void telefone1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1FieldActionPerformed

    private void telefone2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone2FieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void cnpjFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjFieldActionPerformed

    private void logradouroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logradouroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logradouroFieldActionPerformed

    private void bairroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroFieldActionPerformed

    private void cidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeFieldActionPerformed

    private void cepFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepFieldActionPerformed

    private void complementoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void ufFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroLaboratorio dialog = new CadastroLaboratorio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComplementoLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField bairroField;
    private javax.swing.JTextField cepField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JTextField cnpjField;
    private javax.swing.JTextField complementoField;
    private javax.swing.JTextField contatoField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPaneltitulo;
    private javax.swing.JTextField logradouroField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel10;
    private javax.swing.JLabel nomeLabel8;
    private javax.swing.JLabel nomeLabel9;
    private javax.swing.JLabel nomeSocialLabel;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JTextField telefone1Field;
    private javax.swing.JLabel telefone1Label;
    private javax.swing.JTextField telefone2Field;
    private javax.swing.JLabel telefone2Label;
    private javax.swing.JTextField ufField;
    // End of variables declaration//GEN-END:variables

    public JTextField getEmailField() {
        return EmailField;
    }

    public void setEmailField(JTextField EmailField) {
        this.EmailField = EmailField;
    }

    public JTextField getBairroField() {
        return bairroField;
    }

    public void setBairroField(JTextField bairroField) {
        this.bairroField = bairroField;
    }

    public JTextField getCepField() {
        return cepField;
    }

    public void setCepField(JTextField cepField) {
        this.cepField = cepField;
    }

    public JTextField getCidadeField() {
        return cidadeField;
    }

    public void setCidadeField(JTextField cidadeField) {
        this.cidadeField = cidadeField;
    }

    public JTextField getCnpjField() {
        return cnpjField;
    }

    public void setCnpjField(JTextField cnpjField) {
        this.cnpjField = cnpjField;
    }

    public JTextField getComplementoField() {
        return complementoField;
    }

    public void setComplementoField(JTextField complementoField) {
        this.complementoField = complementoField;
    }

    public JTextField getContatoField() {
        return contatoField;
    }

    public void setContatoField(JTextField contatoField) {
        this.contatoField = contatoField;
    }

    public JTextField getIdField() {
        return idField;
    }

    public void setIdField(JTextField idField) {
        this.idField = idField;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public void setjButtonCancelar(JButton jButtonCancelar) {
        this.jButtonCancelar = jButtonCancelar;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public void setjButtonGravar(JButton jButtonGravar) {
        this.jButtonGravar = jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public void setjButtonNovo(JButton jButtonNovo) {
        this.jButtonNovo = jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JComboBox<String> getjComboStatus() {
        return jComboStatus;
    }

    public void setjComboStatus(JComboBox<String> jComboStatus) {
        this.jComboStatus = jComboStatus;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public void setjPanelBotoes(JPanel jPanelBotoes) {
        this.jPanelBotoes = jPanelBotoes;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JTextField getLogradouroField() {
        return logradouroField;
    }

    public void setLogradouroField(JTextField logradouroField) {
        this.logradouroField = logradouroField;
    }

    public JTextField getNomeField() {
        return nomeField;
    }

    public void setNomeField(JTextField nomeField) {
        this.nomeField = nomeField;
    }

    public JTextField getTelefone1Field() {
        return telefone1Field;
    }

    public void setTelefone1Field(JTextField telefone1Field) {
        this.telefone1Field = telefone1Field;
    }

    public JTextField getTelefone2Field() {
        return telefone2Field;
    }

    public void setTelefone2Field(JTextField telefone2Field) {
        this.telefone2Field = telefone2Field;
    }

    public JTextField getUfField() {
        return ufField;
    }

    public void setUfField(JTextField ufField) {
        this.ufField = ufField;
    }

}
