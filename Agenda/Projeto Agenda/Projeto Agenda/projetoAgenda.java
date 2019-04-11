import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.text.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class projetoAgenda extends JFrame implements ActionListener, ItemListener, ListSelectionListener, WindowListener{
   
   private JTextField txtNome;
   private JTextField txtEndereco;
   private JTextField txtEmail;
   private JTextField txtTelefone;
   private JLabel lblID;
   private JLabel lblNome;
   private JLabel lblEmail;
   private JLabel lblTelefone;
   private JLabel lblEndereco;
   private JButton botaoSair;
   private JButton botaoCadastrar;
   private JButton botaoEditar;
   private JButton botaoDeletar;
   private JPanel panelAgenda;
   private JPanel table;
   private JTable tabela;
   private JScrollPane scroll;
   private Container caixa;
   private int id;
   private Connection conn; 
   private Agenda agenda;
   
   public projetoAgenda(){
      super("Agenda");
      panelAgenda = new JPanel();   
      botaoCadastrar = new JButton("Salvar");
      botaoSair = new JButton("Sair");
      botaoEditar = new JButton("Editar");
      botaoDeletar = new JButton("Deletar");
      txtNome = new JTextField(15);
      txtEmail = new JTextField(15);
      txtTelefone = new JTextField(15);
      txtEndereco = new JTextField(25);
      
      lblID = new JLabel("");
      lblNome = new JLabel("Nome:");
      lblEmail = new JLabel("E-mail:");
      lblTelefone = new JLabel("Telefone:");
      lblEndereco = new JLabel("Endereço:");
      
      JPanel nome = new JPanel();
      nome.add(lblNome);
      nome.add(txtNome);
      nome.setBackground(Color.lightGray);
      
      JPanel email = new JPanel();
      email.add(lblEmail);
      email.add(txtEmail);
      email.setBackground(Color.lightGray);
      
      JPanel telefone = new JPanel();
      telefone.add(lblTelefone);
      telefone.add(txtTelefone);
      telefone.setBackground(Color.lightGray);
      
      JPanel endereco = new JPanel();
      endereco.add(lblEndereco);
      endereco.add(txtEndereco);
      endereco.setBackground(Color.lightGray);
      
      JPanel textos = new JPanel();
      textos.add(nome);
      textos.add(email);
      textos.add(telefone);
      textos.add(endereco);
      textos.setLayout(new GridLayout(5, 1));
      textos.setBackground(Color.lightGray);
      
      JPanel botao = new JPanel();
      botao.add(botaoCadastrar);
      botao.add(botaoEditar);
      botao.add(botaoDeletar);
      botao.add(botaoSair);
      botao.add(lblID);
      lblID.setVisible(false);
      botao.setBackground(Color.lightGray);
      
      caixa = getContentPane();
      setLayout(new FlowLayout());
      setLayout(new BorderLayout());
      
      /*tabelaAgenda();
      table = new JPanel();
      table.add(scroll);
      table.setBackground(Color.lightGray);
      
      caixa.add(botao, BorderLayout.WEST);
      caixa.add(textos, BorderLayout.CENTER);
      caixa.add(table, BorderLayout.SOUTH);
      
     
      
      botaoCadastrar.addActionListener(this);
      botaoEditar.addActionListener(this);
      botaoDeletar.addActionListener(this);
      botaoSair.addActionListener(this);
      
      setResizable(false);
      setSize(900,600);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   
   */
   
   
   private AgendaService service;
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == botaoCadastrar){
         try{
            service = new AgendaService();
            agenda.setNome(txtNome.getText());
            agenda.setEmail(txtEmail.getText());
            agenda.setTelefone(txtTelefone.getText());
            agenda.setEndereco(txtEndereco.getText());
            service.inserir(agenda);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
         }
         catch(Exception exc){
            exc.printStackTrace();
         }
      }
      else{
         if(e.getSource() == botaoEditar){
            try{
               id = Integer.parseInt(lblID.getText());
               agenda.setId(id);
               agenda.setNome(txtNome.getText());
               agenda.setEmail(txtEmail.getText());
               agenda.setTelefone(txtTelefone.getText());
               agenda.setEndereco(txtEndereco.getText());
               service.editar(agenda);
               this.dispose();
               this.setVisible(true);
            }
            catch(Exception exc){
               exc.printStackTrace();
            }
         
         }
         else{
            if(e.getSource() == botaoDeletar){
               try{
                  id = Integer.parseInt(lblID.getText());
                  agenda.setId(id);
                  service.excluir(id);
                  this.dispose();
                  this.setVisible(true);
               }
               catch(Exception exc){
                  exc.printStackTrace();
               }
            }
            else{
               if(e.getSource() == botaoSair){
                  System.exit(0);
               }
            }
         }
      }
   }
/*   public void tabelaAgenda(){
      agenda = new Agenda();
      tabela = new JTable();
      tabela.setModel(agenda.metodo());
      tabela.getSelectionModel().addListSelectionListener(this);
      scroll = new JScrollPane(tabela);
      tabela.setPreferredScrollableViewportSize(new Dimension(850,300));
      addWindowListener(this);
   }
   public void itemStateChanged(ItemEvent e){
      if(e.getStateChange() == ItemEvent.SELECTED){
         caixa.remove(table);
         table.remove(scroll);
         tabelaAgenda();
         table.add(scroll);
         caixa.add(table, BorderLayout.SOUTH);
         validate();
         repaint();
      }
   }
   public void valueChanged(ListSelectionEvent e){
      if(e.getValueIsAdjusting()){
         lblID.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
         txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
         txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
         txtTelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
         txtEndereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
      }
   }
   public void windowClosing(WindowEvent e) {
   }
   public void windowClosed(WindowEvent e) {
   }
  public void windowOpened(WindowEvent e) {
      listaAgenda();
   }*/
   public void windowIconified(WindowEvent e) {
   }
   public void windowDeiconified(WindowEvent e) {
   }
   /*public void windowActivated(WindowEvent wev){
      listaAgenda();
   }
   public void windowDeactivated(WindowEvent e) {
      listaAgenda();
   }*/
}