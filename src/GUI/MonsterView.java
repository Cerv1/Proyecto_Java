package GUI;

import NapakalakiGame.Monster;
import javax.swing.ImageIcon;


public class MonsterView extends javax.swing.JPanel{

  Monster monsterModel;
  PrizeView prizeModel = new PrizeView();
  BadConsequenceView badConsequenceModel = new BadConsequenceView();
  
  public MonsterView(){
    initComponents();
  }
  
  public void setMonster(Monster m){
    monsterModel=m;

    L_MonsterNombre.setText(monsterModel.getName());
    L_MonsterCombatLevel.setText(String.valueOf(monsterModel.getCombatLevel()));
    L_MonsterBadConsequence.setBadConsequence(monsterModel.getBadConsequence());
    L_MonsterPrize.setPrize(monsterModel.getPrize());

    L_MonsterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monsters/"+m.getName()+".jpg")));
    L_MonsterIcon.repaint();
    
    repaint();
    revalidate();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    L_MonsterIcon = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    L_MonsterName = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    L_MonsterPrize = new GUI.PrizeView();
    jLabel4 = new javax.swing.JLabel();
    L_MonsterCombatLevel = new javax.swing.JLabel();
    L_MonsterBadConsequence = new GUI.BadConsequenceView();
    L_MonsterNombre = new javax.swing.JLabel();

    jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel1.setText("Name");

    jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel2.setText("BadConsequence");

    jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel3.setText("Prize");

    jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    jLabel4.setText("CombatLevel");

    L_MonsterCombatLevel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

    L_MonsterNombre.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(L_MonsterNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(L_MonsterName)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(L_MonsterCombatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2)
          .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(L_MonsterBadConsequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(L_MonsterPrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(12, 12, 12)
            .addComponent(L_MonsterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(L_MonsterName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(L_MonsterCombatLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(L_MonsterNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(12, 12, 12)
        .addComponent(jLabel2)
        .addGap(6, 6, 6)
        .addComponent(L_MonsterBadConsequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGap(6, 6, 6)
            .addComponent(L_MonsterPrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(L_MonsterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    L_MonsterName.getAccessibleContext().setAccessibleName("L_MonsterName");
    L_MonsterPrize.getAccessibleContext().setAccessibleName("L_MonsterPrize");
    L_MonsterCombatLevel.getAccessibleContext().setAccessibleName("L_MonsterCombatLevel");
    L_MonsterBadConsequence.getAccessibleContext().setAccessibleName("L_MonsterBadConsequence");
    L_MonsterNombre.getAccessibleContext().setAccessibleName("L_MonsterNombre");
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private GUI.BadConsequenceView L_MonsterBadConsequence;
  private javax.swing.JLabel L_MonsterCombatLevel;
  private javax.swing.JLabel L_MonsterIcon;
  private javax.swing.JLabel L_MonsterName;
  private javax.swing.JLabel L_MonsterNombre;
  private GUI.PrizeView L_MonsterPrize;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  // End of variables declaration//GEN-END:variables
}
