/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CidadeDAO;
import Controller.EstadoDAO;
import Controller.FabricanteDAO;
import Controller.FornecedorDAO;
import Controller.ModeloDAO;
import Controller.PaisDAO;
import Controller.ProdutoDAO;
import Controller.ClienteDAO;
import Controller.CargaDAO;
import Enums.Unidade;
import Model.Fabricante;
import Model.Fornecedor;
import Model.Modelo;
import Model.MyTableModel;
import Model.Produto;
import Model.Carga;
import Model.Cliente;
import Model.Cidade;
import Model.Estado;
import Model.Pais;
import Model.Veiculo;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Henrique
 */
public class DialogCarga extends javax.swing.JDialog {
    
    private CargaDAO dao = new CargaDAO();
   
    private void carregaTableCarga(){
        TableCarga.setModel(
        new MyTableModel (Carga.class,
       dao.getAll(),TableCarga));
   }
    private void carregaTableCarga(String filtro){ TableCarga.setModel(
        new MyTableModel (Carga.class,
        dao.getAll(filtro),TableCarga));
        
   }
    private void carregaFabricante(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new FabricanteDAO().getAll()
        ));
        combo_frabricante_produto.setModel(cbm);
    }
   
     private void carregaFornecedor(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new FornecedorDAO().getAll()
        ));
        combo_fornecedor_produto.setModel(cbm);
    }
     
     private void carregaUnidade(){
        DefaultComboBoxModel cbm =
        new DefaultComboBoxModel(Unidade.values());
        combo_medida.setModel(cbm);
    }
     private void carregaPais(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new PaisDAO().getAll()
        ));
        combo_pais.setModel(cbm);
    }
    
    private void carregaEstado(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new EstadoDAO().getAll()
        ));
        combo_estado.setModel(cbm);
    }
    
    private void carregaCidade(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new CidadeDAO().getAll()
        ));
        combo_cidade.setModel(cbm);
    }
    private void carregaCliente(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new ClienteDAO().getAll()
        ));
        combo_cliente.setModel(cbm);
    }
    
     private void iniciaComponentes(){
       texto_id_carga.setText("");
       texto_valor_frete.setText("");
       texto_quantidade_produto.setText("");
       combo_fornecedor_produto.setSelectedIndex(0);
       combo_frabricante_produto.setSelectedIndex(0);
       combo_cliente.setSelectedIndex(0);
       combo_medida.setSelectedIndex(0);
       combo_produto.setSelectedIndex(0);
       combo_cidade.setSelectedIndex(0);
       combo_estado.setSelectedIndex(0);
       combo_pais.setSelectedIndex(0);
       texto_consulta_placa_veiculo.setText("");
       texto_valor_frete.requestFocus();
   }
   private Carga populateObject() throws NumberFormatException{
        return new Carga(
        texto_id_carga.getText().isEmpty()?1:Integer.parseInt(texto_id_carga.getText()),
        Double.parseDouble(texto_valor_frete.getText()),
        Integer.parseInt(texto_quantidade_produto.getText()),
        (Produto)combo_produto.getSelectedItem(),
        (Unidade)combo_medida.getSelectedItem(),
        (Cliente)combo_cliente.getSelectedItem(),
        (Fabricante)combo_fornecedor_produto.getSelectedItem(),
        (Fornecedor)combo_frabricante_produto.getSelectedItem(),
        (Cidade)combo_cidade.getSelectedItem(),
        (Estado)combo_estado.getSelectedItem(),
        (Pais)combo_pais.getSelectedItem(),
        texto_veiculo.getText());    
    }
   
   private void populateComponentes(Carga carga){
        texto_id_carga.setText(carga.getId()+"");
        texto_valor_frete.setText(carga.getFrete()+"");
        texto_quantidade_produto.setText(carga.getQuantidadeproduto()+"");
        combo_produto.setSelectedItem(carga.getProduto());
        combo_medida.setSelectedItem(carga.getUnidade()); 
        combo_cliente.setSelectedItem(carga.getCliente());
        combo_fornecedor_produto.setSelectedItem(carga.getFornecedor());
        combo_frabricante_produto.setSelectedItem(carga.getFabricante()); 
        combo_cidade.setSelectedItem(carga.getCidade()); 
        combo_estado.setSelectedItem(carga.getEstado()); 
        combo_pais.setSelectedItem(carga.getPais()); 
        texto_veiculo.setText(carga.getVeiculo()); 
       
        
       
    }
    
    

    /**
     * Creates new form DialogCarga
     */
    public DialogCarga(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaTableCarga();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        texto_valor_frete = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        combo_cidade = new javax.swing.JComboBox<>();
        combo_estado = new javax.swing.JComboBox<>();
        combo_pais = new javax.swing.JComboBox<>();
        ButtonSalvaCarga = new javax.swing.JButton();
        ButtonExcluirCarga = new javax.swing.JButton();
        buttonAddCarga = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        combo_cliente = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jfild2 = new javax.swing.JLabel();
        combo_produto = new javax.swing.JComboBox<>();
        combo_frabricante_produto = new javax.swing.JComboBox<>();
        combo_fornecedor_produto = new javax.swing.JComboBox<>();
        jfild3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        texto_id_carga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texto_quantidade_produto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combo_medida = new javax.swing.JComboBox<>();
        texto_veiculo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCarga = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        buttonconsulta = new javax.swing.JButton();
        texto_consulta_placa_veiculo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Valor Frete");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SELECIONE A REGIÃO QUE O VEÍCULO IRÁ CARREGAR");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Cidade:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Pais:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Estado:");

        combo_cidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonSalvaCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-salvar.png"))); // NOI18N
        ButtonSalvaCarga.setText("Salvar");
        ButtonSalvaCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvaCargaActionPerformed(evt);
            }
        });

        ButtonExcluirCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-excluir.png"))); // NOI18N
        ButtonExcluirCarga.setText("Excluir");
        ButtonExcluirCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirCargaActionPerformed(evt);
            }
        });

        buttonAddCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-novo.png"))); // NOI18N
        buttonAddCarga.setText("Novo");
        buttonAddCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCargaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Destinatario:");

        combo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("Produto");

        jfild2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jfild2.setText("Fabricante Produto");

        combo_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_frabricante_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_fornecedor_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jfild3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jfild3.setText("Fornecedor Produto");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("ID:");

        texto_id_carga.setEditable(false);
        texto_id_carga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setText("Veiculo");

        jLabel2.setText("Quantidade Produto");

        jLabel4.setText("UN Medida");

        combo_medida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(texto_id_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(texto_valor_frete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto_veiculo)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(143, 143, 143))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jfild3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(combo_fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combo_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jfild2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combo_frabricante_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonAddCarga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonSalvaCarga))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonExcluirCarga))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_id_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_valor_frete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfild3)
                    .addComponent(combo_fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jfild2)
                    .addComponent(combo_frabricante_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(combo_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(texto_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(combo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(combo_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddCarga)
                    .addComponent(ButtonSalvaCarga)
                    .addComponent(ButtonExcluirCarga))
                .addContainerGap())
        );

        TableCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableCarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCargaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCarga);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consulta Mercadoria Veiculo:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonconsulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonconsulta.setText("CONSULTAR");
        buttonconsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        texto_consulta_placa_veiculo.setToolTipText("");
        texto_consulta_placa_veiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto_consulta_placa_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto_consulta_placa_veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(buttonconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvaCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvaCargaActionPerformed
        // TODO add your handling code here:
        try{
            if(texto_id_carga.getText().isEmpty()){
                dao.add(this.populateObject());
                JOptionPane.showMessageDialog(null,"Cadastro da carga realizado com Sucesso");
            }else{
                dao.update(this.populateObject());
                JOptionPane.showMessageDialog(null,"Alterações Realizadas Com Sucesso");
            }
            this.carregaTableCarga();
            this.iniciaComponentes();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonSalvaCargaActionPerformed

    private void ButtonExcluirCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirCargaActionPerformed
        // TODO add your handling code here:
        if(texto_id_carga.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Para realizar uma Exclusão deve selecionar uma Carga");
            return;
        }
        if(JOptionPane.showConfirmDialog(null, "CONFIRMA?")!=0){
            return;
        }
        JOptionPane.showMessageDialog(null,"Exclusão realizada com Sucesso");
        try{
            dao.remove(dao.get(Carga.class, Integer.parseInt(texto_id_carga.getText())));
            this.iniciaComponentes();
            this.carregaTableCarga();
        }catch (NumberFormatException ex)  {

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonExcluirCargaActionPerformed

    private void buttonAddCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCargaActionPerformed
        // TODO add your handling code here:
        this.iniciaComponentes();
    }//GEN-LAST:event_buttonAddCargaActionPerformed

    private void TableCargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCargaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()==2){
            int codigo= Integer.parseInt(
                TableCarga.getValueAt(
                    TableCarga.getSelectedRow(),
                    0)+"");
            this.populateComponentes(
                dao.get(Carga.class,codigo));
        }
    }//GEN-LAST:event_TableCargaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.carregaFabricante();
        this.carregaFornecedor();
        this.carregaUnidade();
        this.carregaCidade();
        this.carregaEstado();
        this.carregaPais();
        this.carregaCliente();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DialogCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCarga dialog = new DialogCarga(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ButtonExcluirCarga;
    private javax.swing.JButton ButtonSalvaCarga;
    private javax.swing.JTable TableCarga;
    private javax.swing.JButton buttonAddCarga;
    private javax.swing.JButton buttonconsulta;
    private javax.swing.JComboBox<String> combo_cidade;
    private javax.swing.JComboBox<String> combo_cliente;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JComboBox<String> combo_fornecedor_produto;
    private javax.swing.JComboBox<String> combo_frabricante_produto;
    private javax.swing.JComboBox<String> combo_medida;
    private javax.swing.JComboBox<String> combo_pais;
    private javax.swing.JComboBox<String> combo_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jfild2;
    private javax.swing.JLabel jfild3;
    private javax.swing.JTextField texto_consulta_placa_veiculo;
    private javax.swing.JTextField texto_id_carga;
    private javax.swing.JTextField texto_quantidade_produto;
    private javax.swing.JTextField texto_valor_frete;
    private javax.swing.JTextField texto_veiculo;
    // End of variables declaration//GEN-END:variables
}
