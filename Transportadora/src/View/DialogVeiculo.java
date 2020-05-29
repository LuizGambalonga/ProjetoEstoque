/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CidadeDAO;
import Controller.EstadoDAO;
import Controller.PaisDAO;
import Controller.ClienteDAO;
import Controller.FabricanteDAO;
import Controller.FornecedorDAO;
import Controller.ModeloDAO;
import Controller.VeiculoDAO;
import Enums.Cor;
import Model.Cidade;
import Model.MyTableModel;
import Model.Veiculo;
import Model.Fabricante;
import Model.Cliente;
import Model.Estado;
import Model.Fornecedor;
import Model.Modelo;
import Model.Pais;
import Model.Produto;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Henrique
 */
public class DialogVeiculo extends javax.swing.JDialog {
      private VeiculoDAO dao = new VeiculoDAO();
    
      private void carregaTableVeiculo(){
        TableCadastro.setModel(
        new MyTableModel (Veiculo.class,
       dao.getAll(),TableCadastro));
    }
    private void carregaTableVeiculo(String filtro){ TableCadastro.setModel(
        new MyTableModel (Veiculo.class,
        dao.getAll(filtro),TableCadastro));
        
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
     private void carregaCor(){
        DefaultComboBoxModel cbm =
        new DefaultComboBoxModel(Cor.values());
        combo_cor.setModel(cbm);
    }
     private void carregaModelo(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new ModeloDAO().getAll()
        ));
        combo_modelo.setModel(cbm);
    }
     private void carregaFabricante(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new FabricanteDAO().getAll()
        ));
        combo_fabricante.setModel(cbm);
    }
   
     private void carregaFornecedor(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new Vector(
        new FornecedorDAO().getAll()
        ));
        combo_fornecedor.setModel(cbm);
    }
     
     private void iniciaComponentes(){
       texto_id.setText("");
       texto_placa.setText("");
       texto_c_placa.setText("");
       texto_ano_fabricacao.setText("");
       texto_chassis.setText("");
       texto_renavam.setText("");
       combo_cor.setSelectedIndex(0);
       combo_fabricante.setSelectedIndex(0);
       combo_fornecedor.setSelectedIndex(0);
       combo_estado.setSelectedIndex(0);
       combo_pais.setSelectedIndex(0);
       combo_cidade.setSelectedIndex(0);
   }
   private Veiculo populateObject() //throws NumberFormatException{
                                     {
        return new Veiculo(
        texto_id.getText().isEmpty()?1:Integer.parseInt(texto_id.getText()),
        texto_placa.getText(),
        Integer.parseInt(texto_chassis.getText()+""),
        Integer.parseInt(texto_renavam.getText()+""),
        Integer.parseInt(texto_ano_fabricacao.getText()+""),
        Double.parseDouble(texto_valor_veiculo.getText()+""),
        (Cor)combo_cor.getSelectedItem(),
        (Modelo)combo_modelo.getSelectedItem(),
        (Fabricante)combo_fabricante.getSelectedItem(), 
        (Fornecedor)combo_fornecedor.getSelectedItem(),
        (Cidade)combo_cidade.getSelectedItem(),
        (Estado)combo_estado.getSelectedItem(),
        (Pais)combo_pais.getSelectedItem());  
    }
   
   private void populateComponentes(Veiculo veiculo){
        texto_id.setText(veiculo.getId()+"");
        texto_placa.setText(veiculo.getPlaca());
        texto_c_placa.setText(veiculo.getPlaca());
        texto_chassis.setText(veiculo.getChassis()+"");
        texto_renavam.setText(veiculo.getRenavam()+"");
        texto_valor_veiculo.setText(veiculo.getValor_veiculo()+"");
        texto_ano_fabricacao.setText(veiculo.getFabricacao()+"");
        combo_cor.setSelectedItem(veiculo.getCor());
        combo_modelo.setSelectedItem(veiculo.getModelo());
        combo_fabricante.setSelectedItem(veiculo.getFabricacao());
        combo_fornecedor.setSelectedItem(veiculo.getFornecedor());
        
        
        
    }

    /**
     * Creates new form DialogVeiculo
     */
    public DialogVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        texto_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        texto_placa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        texto_chassis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        texto_renavam = new javax.swing.JTextField();
        texto_ano_fabricacao = new javax.swing.JTextField();
        texto_valor_veiculo = new javax.swing.JTextField();
        combo_cor = new javax.swing.JComboBox<>();
        buttonNovoCadastro = new javax.swing.JButton();
        ButtonSalvarCadastro = new javax.swing.JButton();
        ButtonExcluirCadastro = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        combo_modelo = new javax.swing.JComboBox<>();
        jfild = new javax.swing.JLabel();
        combo_fabricante = new javax.swing.JComboBox<>();
        jfild1 = new javax.swing.JLabel();
        combo_fornecedor = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        combo_cidade = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox<>();
        combo_pais = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        texto_busca_Placa = new javax.swing.JButton();
        texto_c_placa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCadastro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veiculo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("ID:");

        texto_id.setEditable(false);
        texto_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Placa:");

        texto_placa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Chassis");

        texto_chassis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Renavam");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Ano de Fabricacao");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Valor Veiculo");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Cor");

        texto_renavam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        texto_ano_fabricacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        texto_valor_veiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        combo_cor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonNovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-novo.png"))); // NOI18N
        buttonNovoCadastro.setText("Novo");
        buttonNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoCadastroActionPerformed(evt);
            }
        });

        ButtonSalvarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-salvar.png"))); // NOI18N
        ButtonSalvarCadastro.setText("Salvar");
        ButtonSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarCadastroActionPerformed(evt);
            }
        });

        ButtonExcluirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-excluir.png"))); // NOI18N
        ButtonExcluirCadastro.setText("Excluir");
        ButtonExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirCadastroActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Modelo");

        combo_modelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jfild.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jfild.setText("Fabricante");

        combo_fabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jfild1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jfild1.setText("Fornecedor");

        combo_fornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Cidade:");

        combo_cidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Estado:");

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estadoActionPerformed(evt);
            }
        });

        combo_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Pais:");

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/btn-salvar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto_valor_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jfild)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(texto_chassis, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(texto_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(texto_ano_fabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jfild1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto_renavam, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSalvarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonExcluirCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_valor_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(combo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfild)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(texto_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(texto_ano_fabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(combo_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfild1)
                        .addComponent(combo_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(texto_chassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(texto_renavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(combo_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(combo_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNovoCadastro)
                    .addComponent(ButtonSalvarCadastro)
                    .addComponent(ButtonExcluirCadastro)
                    .addComponent(btn_editar))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Cadastro do Veiculo:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        texto_busca_Placa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        texto_busca_Placa.setText("BUSCAR");
        texto_busca_Placa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        texto_busca_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_busca_PlacaActionPerformed(evt);
            }
        });

        texto_c_placa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        texto_c_placa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TableCadastro.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCadastro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_c_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_busca_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(texto_c_placa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto_busca_Placa, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCadastroMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()==2){
            int codigo= Integer.parseInt(
                TableCadastro.getValueAt(
                    TableCadastro.getSelectedRow(),
                    0)+"");
            this.populateComponentes(
                dao.get(Veiculo.class, codigo));
        }

    }//GEN-LAST:event_TableCadastroMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.carregaTableVeiculo();
        this.carregaPais();
        this.carregaEstado();
        this.carregaCidade();
        this.carregaCor();
        this.carregaFabricante();
        this.carregaFornecedor();
        this.carregaModelo();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void texto_busca_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_busca_PlacaActionPerformed
        // TODO add your handling code here:
        this.carregaTableVeiculo(texto_c_placa.getText());
    }//GEN-LAST:event_texto_busca_PlacaActionPerformed

    private void combo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_estadoActionPerformed

    private void ButtonExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirCadastroActionPerformed
        // TODO add your handling code here:
        if(texto_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Para realizar uma Exclusão deve selecionar uma Carga");
            return;
        }

        if(JOptionPane.showConfirmDialog(null, "CONFIRMA?")!=0){
            return;
        }
        JOptionPane.showMessageDialog(null,"Exclusão realizada com Sucesso");
        try{
            dao.remove(dao.get(Veiculo.class, Integer.parseInt(texto_id.getText())));
            this.iniciaComponentes();
            this.carregaTableVeiculo();
        }catch (NumberFormatException ex)  {

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_ButtonExcluirCadastroActionPerformed

    private void ButtonSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarCadastroActionPerformed
        // TODO add your handling code here:
        if(texto_placa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "É obrigatório inserir uma Placa para prosseguir com o Cadastro");
            texto_placa.requestFocus();
            return;
        }
        if(texto_chassis.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário informar o Chassis do veículo para prosseguir com o Cadastro");
            texto_chassis.requestFocus();
            return;
        }
        if(texto_renavam.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário informar o Renavam do veículo para prosseguir com o Cadastro");
            texto_renavam.requestFocus();
            return;
        }
        if(texto_valor_veiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário informar o valor do veículo para prosseguir com o Cadastro");
            texto_valor_veiculo.requestFocus();
            return;
        }
        if(texto_ano_fabricacao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário informar o Ano de fabricação do veículo para prosseguir com o Cadastro");
            texto_ano_fabricacao.requestFocus();
            return;
        }

        try{
            if(texto_id.getText().isEmpty()){
                dao.add(this.populateObject());
                JOptionPane.showMessageDialog(null,"Cadastro realizado com Sucesso");
            }else{
                dao.update(this.populateObject());
                JOptionPane.showMessageDialog(null,"Alterações Realizadas Com Sucesso");
            }
            this.carregaTableVeiculo();
            this.iniciaComponentes();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_ButtonSalvarCadastroActionPerformed

    private void buttonNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoCadastroActionPerformed
        // TODO add your handling code here:
        this.iniciaComponentes();
    }//GEN-LAST:event_buttonNovoCadastroActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogVeiculo dialog = new DialogVeiculo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ButtonExcluirCadastro;
    private javax.swing.JButton ButtonSalvarCadastro;
    private javax.swing.JTable TableCadastro;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton buttonNovoCadastro;
    private javax.swing.JComboBox<String> combo_cidade;
    private javax.swing.JComboBox<String> combo_cor;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JComboBox<String> combo_fabricante;
    private javax.swing.JComboBox<String> combo_fornecedor;
    private javax.swing.JComboBox<String> combo_modelo;
    private javax.swing.JComboBox<String> combo_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jfild;
    private javax.swing.JLabel jfild1;
    private javax.swing.JTextField texto_ano_fabricacao;
    private javax.swing.JButton texto_busca_Placa;
    private javax.swing.JTextField texto_c_placa;
    private javax.swing.JTextField texto_chassis;
    private javax.swing.JTextField texto_id;
    private javax.swing.JTextField texto_placa;
    private javax.swing.JTextField texto_renavam;
    private javax.swing.JTextField texto_valor_veiculo;
    // End of variables declaration//GEN-END:variables
}
