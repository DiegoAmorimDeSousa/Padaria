
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home(String nome, String nivel) {
        initComponents();
        textoNome.setText(nome);
        Textonivel.setText(nivel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Janela = new javax.swing.JPanel();
        textoNome = new javax.swing.JLabel();
        Textonivel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botaoCaixa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botaoVendas = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        botaoProdutos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botaoFicha = new javax.swing.JButton();
        botaoPontos = new javax.swing.JButton();
        botaoRelatorio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(102, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        textoNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoNome.setText("Aqui vai o nome do Usuário");

        Textonivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Textonivel.setText("Nivel");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botaoCaixa.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Padaria\\Projeto-Padaria\\src\\img\\LOGO-CAIXA.png")); // NOI18N
        botaoCaixa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoCaixaMouseMoved(evt);
            }
        });
        botaoCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCaixaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCaixaMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Vendas");

        botaoVendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Padaria\\Projeto-Padaria\\src\\img\\LOGO-VENDAS.png")); // NOI18N
        botaoVendas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoVendasMouseMoved(evt);
            }
        });
        botaoVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVendasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoVendasMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Produtos");

        botaoProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Padaria\\Projeto-Padaria\\src\\img\\LOGO-PRODUTOS.png")); // NOI18N
        botaoProdutos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoProdutosMouseMoved(evt);
            }
        });
        botaoProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoProdutosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoProdutosMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Caixa");

        botaoFicha.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Padaria\\Projeto-Padaria\\src\\img\\LOGO-CRACHÁ.png")); // NOI18N
        botaoFicha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoFichaMouseMoved(evt);
            }
        });
        botaoFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFichaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoFichaMouseExited(evt);
            }
        });

        botaoPontos.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Padaria\\Projeto-Padaria\\src\\img\\LOGO-PONTOS.png")); // NOI18N
        botaoPontos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoPontosMouseMoved(evt);
            }
        });
        botaoPontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPontosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPontosMouseExited(evt);
            }
        });

        botaoRelatorio.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Padaria\\Projeto-Padaria\\src\\img\\LOGO-RELATORIO.png")); // NOI18N
        botaoRelatorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoRelatorioMouseMoved(evt);
            }
        });
        botaoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRelatorioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoRelatorioMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Ficha");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Pontos");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Relatórios");

        javax.swing.GroupLayout JanelaLayout = new javax.swing.GroupLayout(Janela);
        Janela.setLayout(JanelaLayout);
        JanelaLayout.setHorizontalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addComponent(botaoFicha)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPontos)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JanelaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel5)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6))
                            .addGroup(JanelaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel9))
                            .addGroup(JanelaLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(textoNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Textonivel))
                            .addGroup(JanelaLayout.createSequentialGroup()
                                .addComponent(botaoVendas)
                                .addGap(18, 18, 18)
                                .addComponent(botaoProdutos)
                                .addGap(18, 18, 18)
                                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(botaoCaixa))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JanelaLayout.setVerticalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome)
                    .addComponent(jLabel1)
                    .addComponent(Textonivel))
                .addGap(20, 20, 20)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addComponent(botaoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JanelaLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(155, 155, 155))
                            .addGroup(JanelaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Fechar Caixa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        sair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu1.add(sair);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          dispose();
      new Caixa(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
      
     int trocaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja trocar de usúario ?", "Atenção!", JOptionPane.YES_NO_OPTION);
    if (trocaUsuario == JOptionPane.YES_OPTION){
       dispose();
       new Login().setVisible(true);
    } 
                
    }//GEN-LAST:event_sairActionPerformed

    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     
    }//GEN-LAST:event_formWindowActivated

    private void botaoCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCaixaMouseClicked
         dispose();
   
         new Caixa(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_botaoCaixaMouseClicked

    private void botaoCaixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCaixaMouseExited
        botaoCaixa.setBackground(Janela.getBackground());
    }//GEN-LAST:event_botaoCaixaMouseExited

    private void botaoCaixaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCaixaMouseMoved
         botaoCaixa.setBackground(new Color(0,102,51));
         
    }//GEN-LAST:event_botaoCaixaMouseMoved

    private void botaoVendasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVendasMouseMoved
       botaoVendas.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_botaoVendasMouseMoved

    private void botaoVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVendasMouseClicked
       dispose();
   
        try {
            new NovasVendas(textoNome.getText() , Textonivel.getText()).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoVendasMouseClicked

    private void botaoVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVendasMouseExited
        botaoVendas.setBackground(Janela.getBackground());
    }//GEN-LAST:event_botaoVendasMouseExited

    private void botaoProdutosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProdutosMouseMoved
      botaoProdutos.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_botaoProdutosMouseMoved

    private void botaoProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProdutosMouseClicked
       dispose();
   
         new NovosProdutos(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_botaoProdutosMouseClicked

    private void botaoProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProdutosMouseExited
       botaoProdutos.setBackground(Janela.getBackground());
    }//GEN-LAST:event_botaoProdutosMouseExited

    private void botaoFichaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFichaMouseMoved
       botaoFicha.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_botaoFichaMouseMoved

    private void botaoFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFichaMouseClicked
       dispose();
   
         new Ficha(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_botaoFichaMouseClicked

    private void botaoFichaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFichaMouseExited
       botaoFicha.setBackground(Janela.getBackground());
    }//GEN-LAST:event_botaoFichaMouseExited

    private void botaoPontosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPontosMouseMoved
      botaoPontos.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_botaoPontosMouseMoved

    private void botaoPontosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPontosMouseClicked
       dispose();
   
         new Pontos(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_botaoPontosMouseClicked

    private void botaoPontosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPontosMouseExited
       botaoPontos.setBackground(Janela.getBackground());
    }//GEN-LAST:event_botaoPontosMouseExited

    private void botaoRelatorioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatorioMouseMoved
        botaoRelatorio.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_botaoRelatorioMouseMoved

    private void botaoRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatorioMouseClicked
       dispose();
   
         new Relatorios(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_botaoRelatorioMouseClicked

    private void botaoRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatorioMouseExited
       botaoRelatorio.setBackground(Janela.getBackground());
    }//GEN-LAST:event_botaoRelatorioMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Janela;
    private javax.swing.JLabel Textonivel;
    private javax.swing.JButton botaoCaixa;
    private javax.swing.JButton botaoFicha;
    private javax.swing.JButton botaoPontos;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem sair;
    private javax.swing.JLabel textoNome;
    // End of variables declaration//GEN-END:variables


}