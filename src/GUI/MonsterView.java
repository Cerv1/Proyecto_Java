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
    
    // Dejamos comentados los que serian los labels con los atributos del monstruo
    // para mostrar sus atributos en la imagen.
    //
    //L_MonsterName.setText(monsterModel.getName());
    //L_MonsterCombatLevel.setText(String.valueOf(monsterModel.getCombatLevel()));
    //L_MonsterBadConsequence.setBadConsequence(monsterModel.getBadConsequence());
    //L_MonsterPrize.setPrize(monsterModel.getPrize());
    
    ImageIcon image = new ImageIcon("monsters/"+monsterModel.getName()+".jpg");
    L_MonsterIcon.setIcon(image);

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(L_MonsterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(L_MonsterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel L_MonsterIcon;
  // End of variables declaration//GEN-END:variables
}
