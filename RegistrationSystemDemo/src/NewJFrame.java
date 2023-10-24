/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Oct 15, 2011, 12:29:48 AM
 */

/**
 * http://j4guiang.blogspot.com/
 * @author Jhovarie A. Guiang
 *
 * This code need mysql-connector.jar,JTatoo.jar,nimrodlf.jar and substance.jar
 */

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;

import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.jvnet.substance.skin.SubstanceEmeraldDuskLookAndFeel;
import org.jvnet.substance.skin.SubstanceMagmaLookAndFeel;
import org.jvnet.substance.skin.SubstanceModerateLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaBrickWallLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaLookAndFeel;
import org.jvnet.substance.skin.SubstanceTwilightLookAndFeel;
import java.awt.FlowLayout;
public class NewJFrame extends javax.swing.JFrame {
 Connection conn;
 String url;
 Statement stmt;
 ResultSet rs;
    /** Creates new form NewJFrame */
 public javax.swing.table.DefaultTableModel tableview;
    public NewJFrame() {
        initComponents();
              tableview= new javax.swing.table.DefaultTableModel();
              jTable1 = new javax.swing.JTable(tableview);
               tableview.addColumn("INDO");
               tableview.addColumn("First Name");
               tableview.addColumn("Last Name");
               tableview.addColumn("Gender");
               tableview.addColumn("Course");
               tableview.addColumn("Year Level");
               jScrollPane1.setViewportView(jTable1);
        try{
          url = "jdbc:mysql://localhost:3308/registration?serverTimezone=UTC";
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection(url,"root","");
          stmt = conn.createStatement();
          jMenuItem8.setVisible(false);
        }catch(Exception e){
      int confirm = JOptionPane.showConfirmDialog
          (null, "Database not installed\ndo you want to install it now?", "",JOptionPane.YES_NO_OPTION);
     if(confirm == JOptionPane.YES_OPTION){
         InstallDatabase();
      }else if(confirm == JOptionPane.NO_OPTION){
       JOptionPane.showMessageDialog(null,"Database not installed");
      }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        IDNO_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(137, 75, 44, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(137, 100, 39, 14);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(137, 125, 59, 14);
        FirstName_txt = new javax.swing.JTextField();
        FirstName_txt.setBounds(214, 21, 175, 20);
        LastName_txt = new javax.swing.JTextField();
        LastName_txt.setBounds(214, 47, 175, 20);
        Gender_cmb = new javax.swing.JComboBox();
        Gender_cmb.setBounds(214, 72, 83, 20);
        Course_cmb = new javax.swing.JComboBox();
        Course_cmb.setBounds(214, 97, 51, 20);
        YearLevel_cmb = new javax.swing.JComboBox();
        YearLevel_cmb.setBounds(213, 122, 69, 20);
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration System DEMO");
        setLocationByPlatform(true);
        setResizable(false);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Search");

        IDNO_txt.setFont(new java.awt.Font("Tahoma", 1, 11));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Demo Student Registration System"));
        jPanel1.setLayout(null);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(137, 23, 67, 15);
        // jPanel1.setLayout(new FlowLayout());

         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
         jLabel1.setText("First Name:");
         jPanel1.add(jLabel1);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(137, 49, 67, 15);
        
                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
                jLabel2.setText("Last Name:");
                jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Gender:");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Course");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Year Level");
        jPanel1.add(jLabel5);

        FirstName_txt.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(FirstName_txt);

        LastName_txt.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(LastName_txt);

        Gender_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Male", "Female" }));
        jPanel1.add(Gender_cmb);

        Course_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BSIT", "BSCS" }));
        jPanel1.add(Course_cmb);

        YearLevel_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4rt year" }));
        jPanel1.add(YearLevel_cmb);

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDNO", "Name" }));

        jMenu1.setText("Menu");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Visit Site");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem8.setText("Install Database");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Look And feel");

       
        

        jMenuItem10.setText("HiFiLookAndFeel");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("GraphiteLookAndFeel");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("FastLookAndFeel");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("AluminiumLookAndFeel");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("AeroLookAndFeel");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem4.setText("NimRODLookAndFeel");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem15.setText("SubstanceMagmaLookAndFeel");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("SubstanceEmeraldDuskLookAndFeel");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText("SubstanceNebulaBrickWallLookAndFeel");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem18.setText("SubstanceTwilightLookAndFeel");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuItem19.setText("SubstanceNebulaLookAndFeel");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuItem20.setText("SubstanceModerateLookAndFeel");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem20);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDNO_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNO_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel6)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
try{
  UIManager.setLookAndFeel(new HiFiLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}       // TODO add you()r handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
try{
  UIManager.setLookAndFeel(new GraphiteLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
try{
  UIManager.setLookAndFeel(new FastLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}       
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
try{
  UIManager.setLookAndFeel(new AluminiumLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
try{
  UIManager.setLookAndFeel(new AeroLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
try{
  UIManager.setLookAndFeel(new NimRODLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{
     String findtype;
   if(jComboBox1.getSelectedItem().toString().equals("IDNO")){
     findtype = "IDNO";
   }else{
     findtype = "FirstName";
   }
     stmt = conn.createStatement();
            int row = tableview.getRowCount();
           while(row > 0) {
                row--;
               tableview.removeRow(row);
            }
            ResultSet view = (ResultSet) stmt.executeQuery("select * from tblregistration where "+findtype+" like '"+IDNO_txt.getText()+"%'");

            ResultSetMetaData md = (ResultSetMetaData) view.getMetaData();
            int colcount = md.getColumnCount();

            Object[] data = new Object[colcount];

            while (view.next()) {
                for (int i=1; i<=colcount; i++) {
                    data[i-1] = view.getString(i);
                }
                tableview.addRow(data);
            }
            jScrollPane1.setViewportView(jTable1);
        }catch(Exception e) {System.out.println(e);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
try{
    Runtime.getRuntime().exec("cmd /c start http:j4guiang.blogspot.com/");
}catch(Exception e){}
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
try{
    Runtime.getRuntime().exec("cmd /c start http://j4guiang-mailing-list.2303136.n4.nabble.com/");
}catch(Exception e){}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
 try{
  UIManager.setLookAndFeel(new SubstanceMagmaLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
 try{
  UIManager.setLookAndFeel(new SubstanceEmeraldDuskLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
 try{
  UIManager.setLookAndFeel(new SubstanceNebulaBrickWallLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
 try{
  UIManager.setLookAndFeel(new SubstanceTwilightLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
 try{
  UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){} 
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
 try{
  UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
  SwingUtilities.updateComponentTreeUI(this);
}catch(Exception ex){}         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
InstallDatabase();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(Gender_cmb.getSelectedItem().toString().equals("Choose one")){
    JOptionPane.showMessageDialog(null,"Please select Gender");
}else{
    try{
     stmt.executeUpdate("insert into tblregistration(FirstName,LastName,Gender,Course,YearLevel)values('"+FirstName_txt.getText()+
             "','"+LastName_txt.getText()+"','"+Gender_cmb.getSelectedItem()+"',"
             + "'"+Course_cmb.getSelectedItem()+"','"+YearLevel_cmb.getSelectedItem()+"')");
     rs = stmt.executeQuery("select * from tblregistration where FirstName='"+FirstName_txt.getText()+"' and LastName='"+LastName_txt.getText()+"'"
             + " and Gender='"+Gender_cmb.getSelectedItem()+"' and Course='"+Course_cmb.getSelectedItem()+"' "
             + " and YearLevel='"+YearLevel_cmb.getSelectedItem()+"'");
     while(rs.next()){
         System.out.println(rs.getString("IDNO"));
         JOptionPane.showMessageDialog(null,"Record successfuly Save: \n Your IDNO:"+rs.getString("IDNO"));
     }
}catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
stmt.executeUpdate("delete from tblregistration where IDNO='"+IDNO_txt.getText()+"'");
JOptionPane.showMessageDialog(null,"Record successfuly deleted");
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try{
stmt.executeUpdate("update tblregistration set FirstName='"+FirstName_txt.getText()+"',"
        + "LastName='"+LastName_txt.getText()+"',Gender='"+Gender_cmb.getSelectedItem()+"',"
        + "Course='"+Course_cmb.getSelectedItem()+"',YearLevel='"+YearLevel_cmb.getSelectedItem()+"' where IDNO='"+IDNO_txt.getText()+"'");
JOptionPane.showMessageDialog(null,"Update successful");
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
LastName_txt.setText(null);
FirstName_txt.setText(null);
IDNO_txt.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
try{
    Runtime.getRuntime().exec("cmd /c start http://j4guiang.blogspot.com/2011/10/java-mysql-basic-with-gui.html");
}catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Course_cmb;
    private javax.swing.JTextField FirstName_txt;
    private javax.swing.JComboBox Gender_cmb;
    private javax.swing.JTextField IDNO_txt;
    private javax.swing.JTextField LastName_txt;
    private javax.swing.JComboBox YearLevel_cmb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void InstallDatabase() {
         try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               
                url = "jdbc:mysql://localhost:3308/";
                 conn = DriverManager.getConnection(url,"root","");
                 stmt = conn.createStatement();
                 stmt.executeUpdate("create database registration");
                 stmt.executeUpdate("use registration");
                 url = "jdbc:mysql://localhost/registration?serverTimezone=UTC";
                conn = DriverManager.getConnection(url,"root","");
                stmt.executeUpdate("create table tblregistration(IDNO int primary key auto_increment,"
                        + "FirstName varchar(30),LastName varchar(30),Gender varchar(10),Course varchar(20),"
                        + "YearLevel varchar(20))");
             JOptionPane.showMessageDialog(null,"Installing database successfull.\n"
                 + "click ok \nand run this application again.");
         System.exit(0);
          }catch(Exception f){
            JOptionPane.showMessageDialog(null,f);
          }
    }
}
