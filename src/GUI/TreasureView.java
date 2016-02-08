
package GUI;

import NapakalakiGame.Treasure;

public class TreasureView extends javax.swing.JPanel{
    
    Treasure treasureModel;
    boolean selected=false;
    /**
     * Creates new form TreasureView
     */
    public TreasureView(){
      initComponents();
    }

    public void setTreasure(Treasure T){
      treasureModel=T;
      repaint();
    }
    
    public Treasure getTreasure(){
      return treasureModel;
    }
    
    public boolean isSelected(){
      return selected;
    }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    L_TreasureName = new javax.swing.JLabel();
    L_TreasureBonus = new javax.swing.JLabel();
    L_TreasureType = new javax.swing.JLabel();

    jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel1.setText("Name");

    jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel2.setText("Bonus");

    jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel3.setText("Type");

    L_TreasureName.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

    L_TreasureBonus.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

    L_TreasureType.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(L_TreasureName, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(L_TreasureType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(L_TreasureBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(L_TreasureName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(L_TreasureBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(L_TreasureType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    L_TreasureName.getAccessibleContext().setAccessibleName("L_TreasureName");
    L_TreasureBonus.getAccessibleContext().setAccessibleName("L_TreasureBonus");
    L_TreasureType.getAccessibleContext().setAccessibleName("L_TreasureType");
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel L_TreasureBonus;
  private javax.swing.JLabel L_TreasureName;
  private javax.swing.JLabel L_TreasureType;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  // End of variables declaration//GEN-END:variables
}
