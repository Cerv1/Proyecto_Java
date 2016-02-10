/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.Player;
import NapakalakiGame.Treasure;
import NapakalakiGame.BadConsequence;
import NapakalakiGame.Napakalaki;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PlayerView extends javax.swing.JPanel{
    
    public Player playerModel;
    public BadConsequenceView badConsequenceModel=new BadConsequenceView();
    private Napakalaki napakalakiModel=Napakalaki.getInstance();
    
    public PlayerView(){
      initComponents();
      B_StealTreasure.setEnabled(false);
    }
    
    public void setNapakalakiModel(Napakalaki n){
      this.napakalakiModel=n;
    }
    
    public Napakalaki getNapakalakiModel(){
      return napakalakiModel;
    }
    
    private ArrayList<Treasure> getSelectedTreasures(JPanel aPanel){
      TreasureView tv;
      ArrayList<Treasure> output = new ArrayList();
      for(Component c:aPanel.getComponents()){
        tv=(TreasureView) c;
        if(tv.isSelected())
          output.add(tv.getTreasure());
      }
      return output;
    }
    
    private void fillTreasurePanel(JPanel aPanel, ArrayList<Treasure> aList){
      aPanel.removeAll();
      for(Treasure t : aList){
        TreasureView aTreasureView = new TreasureView();
        aTreasureView.setTreasure(t);
        aTreasureView.setVisible(true);
        aPanel.add(aTreasureView);
      }
      aPanel.repaint();
      aPanel.revalidate();
    }
    
    public void setPlayer(Player p){
      playerModel=p;
      L_PlayerName.setText(playerModel.getName());
      L_PlayerLevel.setText(String.valueOf(playerModel.getLevels()));
      L_PlayerCombatLevel.setText(String.valueOf(playerModel.getCombatLevel()));
      L_PlayerEnemy.setText(String.valueOf(playerModel.getEnemy().getName()));
      if(playerModel.getPendingBadConsequence()!=null)
        L_PendingModel.setPendingBadConsequence(playerModel.getPendingBadConsequence());
      this.fillTreasurePanel(P_VisibleTreasures, playerModel.getVisibleTreasures());
      this.fillTreasurePanel(P_HiddenTreasures, playerModel.getHiddenTreasures());
      repaint();
      revalidate();
    }
    
    public void disableButton(){
      B_MakeVisible.setVisible(false);
      repaint();
      revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    L_PlayerName = new javax.swing.JLabel();
    L_PlayerCombatLevel = new javax.swing.JLabel();
    L_PlayerLevel = new javax.swing.JLabel();
    L_PlayerEnemy = new javax.swing.JLabel();
    B_StealTreasure = new javax.swing.JButton();
    B_DiscardTreasure = new javax.swing.JButton();
    B_MakeVisible = new javax.swing.JButton();
    B_DiscardAllTreasures = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    P_HiddenTreasures = new javax.swing.JPanel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jScrollPane2 = new javax.swing.JScrollPane();
    P_VisibleTreasures = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    L_PendingModel = new GUI.PendingBadConsequenceView();
    jLabel7 = new javax.swing.JLabel();

    B_StealTreasure.setFont(new java.awt.Font("Oxygen-Sans Sans-Book", 0, 11)); // NOI18N
    B_StealTreasure.setText("Steal Treasure");
    B_StealTreasure.setActionCommand("StealTreasure");
    B_StealTreasure.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    B_StealTreasure.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        B_StealTreasureActionPerformed(evt);
      }
    });

    B_DiscardTreasure.setFont(new java.awt.Font("Oxygen-Sans Sans-Book", 0, 11)); // NOI18N
    B_DiscardTreasure.setText("Discard Treasure");
    B_DiscardTreasure.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        B_DiscardTreasureActionPerformed(evt);
      }
    });

    B_MakeVisible.setFont(new java.awt.Font("Oxygen-Sans Sans-Book", 0, 11)); // NOI18N
    B_MakeVisible.setText("Make Visible");
    B_MakeVisible.setToolTipText("");
    B_MakeVisible.setActionCommand("MakeVisible");
    B_MakeVisible.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        B_MakeVisibleActionPerformed(evt);
      }
    });

    B_DiscardAllTreasures.setFont(new java.awt.Font("Oxygen-Sans Sans-Book", 0, 10)); // NOI18N
    B_DiscardAllTreasures.setText("Discard All Treasures");
    B_DiscardAllTreasures.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        B_DiscardAllTreasuresActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel1.setText("Name");

    jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel2.setText("Level");

    jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel3.setText("Combat level");

    jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel4.setText("Enemy's name");

    jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel5.setText("Visible Treasures");

    jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel6.setText("Hidden Treasures");

    P_HiddenTreasures.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    P_HiddenTreasures.add(jScrollPane4);

    jScrollPane1.setViewportView(P_HiddenTreasures);
    P_HiddenTreasures.getAccessibleContext().setAccessibleName("hiddenTreasures");

    P_VisibleTreasures.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    P_VisibleTreasures.add(jScrollPane3);

    jScrollPane2.setViewportView(P_VisibleTreasures);
    P_VisibleTreasures.getAccessibleContext().setAccessibleName("visibleTreasures");

    jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel7.setText("Pending BadConsequence");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel5)
      .addComponent(jLabel6)
      .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(B_StealTreasure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(B_DiscardTreasure, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(B_DiscardAllTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(B_MakeVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(L_PlayerEnemy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(L_PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(L_PlayerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(L_PlayerCombatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addComponent(jLabel7)
      .addComponent(L_PendingModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1)
          .addComponent(L_PlayerCombatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(L_PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addComponent(L_PlayerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel4)
          .addComponent(L_PlayerEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(L_PendingModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(B_StealTreasure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(B_MakeVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(B_DiscardTreasure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(B_DiscardAllTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(15, 15, 15))
    );

    L_PlayerName.getAccessibleContext().setAccessibleName("L_PlayerCombatLevel");
    L_PlayerCombatLevel.getAccessibleContext().setAccessibleName("L_PlayerCombatLevel");
    L_PlayerLevel.getAccessibleContext().setAccessibleName("L_PlayerLevel");
    L_PlayerEnemy.getAccessibleContext().setAccessibleName("L_PlayerEnemy");
    B_StealTreasure.getAccessibleContext().setAccessibleName("B_StealTreasure");
    B_DiscardTreasure.getAccessibleContext().setAccessibleName("B_DiscardTreasure");
    B_MakeVisible.getAccessibleContext().setAccessibleName("B_MakeVisible");
    B_DiscardAllTreasures.getAccessibleContext().setAccessibleName("B_DiscardAllTreasures");
    L_PendingModel.getAccessibleContext().setAccessibleName("L_PendingModel");
  }// </editor-fold>//GEN-END:initComponents

    private void B_StealTreasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_StealTreasureActionPerformed
      if(playerModel.canISteal() && !playerModel.getEnemy().getHiddenTreasures().isEmpty()){
        Treasure t = playerModel.stealTreasure();
        TreasureView tv = new TreasureView();
        tv.setTreasure(t);
        P_HiddenTreasures.add(tv);
        setPlayer(napakalakiModel.getCurrentPlayer());
      }
    }//GEN-LAST:event_B_StealTreasureActionPerformed

    private void B_MakeVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MakeVisibleActionPerformed
      ArrayList<Treasure> selHidden = this.getSelectedTreasures(P_HiddenTreasures);
      napakalakiModel.makeTreasureVisible(selHidden);
      setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_B_MakeVisibleActionPerformed

    private void B_DiscardTreasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DiscardTreasureActionPerformed
      for(Treasure t : getSelectedTreasures(P_HiddenTreasures))
        playerModel.discardHiddenTreasure(t);
      for(Treasure t : getSelectedTreasures(P_VisibleTreasures))
        playerModel.discardVisibleTreasure(t);
      setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_B_DiscardTreasureActionPerformed

    private void B_DiscardAllTreasuresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DiscardAllTreasuresActionPerformed
      playerModel.discardAllTreasures();
      setPlayer(playerModel);
    }//GEN-LAST:event_B_DiscardAllTreasuresActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JButton B_DiscardAllTreasures;
  protected javax.swing.JButton B_DiscardTreasure;
  protected javax.swing.JButton B_MakeVisible;
  protected javax.swing.JButton B_StealTreasure;
  private GUI.PendingBadConsequenceView L_PendingModel;
  private javax.swing.JLabel L_PlayerCombatLevel;
  private javax.swing.JLabel L_PlayerEnemy;
  private javax.swing.JLabel L_PlayerLevel;
  private javax.swing.JLabel L_PlayerName;
  private javax.swing.JPanel P_HiddenTreasures;
  private javax.swing.JPanel P_VisibleTreasures;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  // End of variables declaration//GEN-END:variables
}
