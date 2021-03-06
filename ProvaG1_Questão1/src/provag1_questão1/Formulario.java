/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provag1_questão1;

import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public final class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        diretoNoCodigo();
        preencheComboPessoa();
        preencheComboVeiculo();
    }
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
    
    public void diretoNoCodigo(){         
            
            veiculos.add(new Carro(5, "1","ABC-1234","Fiat","Palio","2004",false,8000));
            veiculos.add(new Carro(5, "2","CBA-1234","Chevrolet","Onix","2016",false,36000));
            veiculos.add(new Moto(1500, "3","BCA-1234","Honda","Titan","2015",false,45000));
            veiculos.add(new Moto(125, "3","GHA-1234","Honda","Biz","2008",false,1500));
            clientes.add(new Cliente("123456789014", "Jusceleinosdorio Kubischeque", "66984561234"));
            clientes.add(new Cliente("410987654321", "Marinete Monete", "63984154234"));
            clientes.add(new Cliente("789465421354", "Yago Pereira", "63981056488"));
            vendas.add(new Venda("1",clientes.get(0),veiculos.get(0)));
            vendas.add(new Venda("2",clientes.get(2),veiculos.get(2)));
        }
    
    public void preencheComboPessoa(){
        clientes.forEach((c) -> {
            cbxCliente.addItem(c.getNome());
        });
    }
    
    public void preencheComboVeiculo(){
        veiculos.forEach((v) -> {
            cbxVeiculo.addItem(v.getPlaca());
        });
    }
    
    public void inserirVenda(){
        String cod = tfCod.getText();
        int posC = cbxCliente.getSelectedIndex();
        int posV = cbxVeiculo.getSelectedIndex();
        
        Cliente cli = clientes.get(posC);
        Veiculo vei = veiculos.get(posV);
        
        vendas.add(new Venda(cod,cli,vei));
    }
    
    public void imprimirTodos(){
        taSaida.setText(null);
        vendas.forEach((v) -> {
            taSaida.append(v.getVeiculo().getPlaca() + " - " + v.getCliente().getNome() + " - " + v.getVeiculo().calculaValor() + "\n");
        });
    }
    
    public void imprimirCarros(){
        taSaida.setText(null);
        for (Venda v : vendas){
            if (v.getVeiculo() instanceof Carro){
                taSaida.append(v.getVeiculo().getPlaca() + " - " + v.getCliente().getNome() + " - " + v.getVeiculo().calculaValor() + "\n");
            }
        }
    }
    
    public void imprimirMotos(){
        taSaida.setText(null);
        for (Venda v : vendas){
            if (v.getVeiculo() instanceof Moto){
                taSaida.append(v.getVeiculo().getPlaca() + " - " + v.getCliente().getNome() + " - " + v.getVeiculo().calculaValor() + "\n");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxVeiculo = new javax.swing.JComboBox<>();
        jbTodos = new javax.swing.JButton();
        jbCarros = new javax.swing.JButton();
        jbMotos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jbInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vender Veiculos");

        jLabel1.setText("Codigo:");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Veiculo:");

        jbTodos.setText("Todas Vendas");
        jbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTodosActionPerformed(evt);
            }
        });

        jbCarros.setText("Vendas Carros");
        jbCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarrosActionPerformed(evt);
            }
        });

        jbMotos.setText("Vendas Motos");
        jbMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMotosActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        taSaida.setBorder(null);
        jScrollPane1.setViewportView(taSaida);

        jbInserir.setText("Inserir Venda");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbTodos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbCarros))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbInserir)
                                    .addComponent(jbMotos))))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbInserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTodos)
                    .addComponent(jbCarros)
                    .addComponent(jbMotos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        inserirVenda();
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTodosActionPerformed
        imprimirTodos();
    }//GEN-LAST:event_jbTodosActionPerformed

    private void jbCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarrosActionPerformed
        imprimirCarros();
    }//GEN-LAST:event_jbCarrosActionPerformed

    private void jbMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMotosActionPerformed
        imprimirMotos();
    }//GEN-LAST:event_jbMotosActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCarros;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbMotos;
    private javax.swing.JButton jbTodos;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfCod;
    // End of variables declaration//GEN-END:variables
}
