package ui;

import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import process.Hash;

public class HashFileView extends JFrame {

    private FileDialog fd = new FileDialog(this, "Open File", FileDialog.LOAD);

    private JFileChooser fc = new JFileChooser();
    private JTextField filePathFld = new JTextField();
    private JButton openBtn = new JButton();
    private JButton mdFiveCpyBtn = new JButton();
    private JButton shaOneCpyBtn = new JButton();
    private JButton shaTwoCpyBtn = new JButton();
    private JLabel mdFiveLbl = new JLabel();
    private JLabel shaOneLbl = new JLabel();
    private JLabel shaTwoLbl = new JLabel();
    private JPanel filePnl = new JPanel();
    private JPanel mdFivePnl = new JPanel();
    private JPanel shaOnePnl = new JPanel();
    private JPanel shaTwoPnl = new JPanel();

    public HashFileView() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        filePnl.setBorder(BorderFactory.createTitledBorder("Open File"));
        filePnl.setPreferredSize(new java.awt.Dimension(640, 67));

        filePathFld.setEditable(false);
        filePathFld.setPreferredSize(new java.awt.Dimension(515, 25));

        openBtn.setText("Open...");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        GroupLayout filePnlLayout = new GroupLayout(filePnl);
        filePnl.setLayout(filePnlLayout);
        filePnlLayout.setHorizontalGroup(filePnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                filePnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filePathFld, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(openBtn)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));
        filePnlLayout.setVerticalGroup(filePnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                filePnlLayout
                        .createSequentialGroup()
                        .addGroup(
                                filePnlLayout
                                        .createParallelGroup(
                                                GroupLayout.Alignment.BASELINE)
                                        .addComponent(filePathFld,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(openBtn))
                        .addGap(0, 17, Short.MAX_VALUE)));

        mdFivePnl.setBorder(BorderFactory.createTitledBorder("MD5"));
        mdFivePnl.setPreferredSize(new java.awt.Dimension(640, 67));

        mdFiveLbl.setText("Waiting...");
        mdFiveLbl.setPreferredSize(new java.awt.Dimension(515, 15));

        mdFiveCpyBtn.setText("Copy");
        mdFiveCpyBtn.setEnabled(false);
        mdFiveCpyBtn.setPreferredSize(new java.awt.Dimension(79, 25));
        mdFiveCpyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout mdFivePnlLayout = new GroupLayout(mdFivePnl);
        mdFivePnl.setLayout(mdFivePnlLayout);
        mdFivePnlLayout.setHorizontalGroup(mdFivePnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                mdFivePnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mdFiveLbl, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mdFiveCpyBtn, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));
        mdFivePnlLayout.setVerticalGroup(mdFivePnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                mdFivePnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                mdFivePnlLayout
                                        .createParallelGroup(
                                                GroupLayout.Alignment.BASELINE)
                                        .addComponent(mdFiveLbl,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mdFiveCpyBtn,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));

        shaOnePnl.setBorder(BorderFactory.createTitledBorder("SHA-1"));
        shaOnePnl.setPreferredSize(new java.awt.Dimension(640, 67));

        shaOneLbl.setText("Waiting...");
        shaOneLbl.setPreferredSize(new java.awt.Dimension(515, 15));

        shaOneCpyBtn.setText("Copy");
        shaOneCpyBtn.setEnabled(false);
        shaOneCpyBtn.setPreferredSize(new java.awt.Dimension(79, 25));
        shaOneCpyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout shaOnePnlLayout = new GroupLayout(shaOnePnl);
        shaOnePnl.setLayout(shaOnePnlLayout);
        shaOnePnlLayout.setHorizontalGroup(shaOnePnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                shaOnePnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(shaOneLbl, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shaOneCpyBtn, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));
        shaOnePnlLayout.setVerticalGroup(shaOnePnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                shaOnePnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                shaOnePnlLayout
                                        .createParallelGroup(
                                                GroupLayout.Alignment.BASELINE)
                                        .addComponent(shaOneLbl,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(shaOneCpyBtn,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));

        shaTwoPnl.setBorder(BorderFactory.createTitledBorder("SHA-256"));
        shaTwoPnl.setPreferredSize(new java.awt.Dimension(640, 67));

        // shaTwoLbl.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        shaTwoLbl.setText("Waiting...");
        shaTwoLbl.setPreferredSize(new java.awt.Dimension(515, 15));

        // jButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        shaTwoCpyBtn.setText("Copy");
        shaTwoCpyBtn.setEnabled(false);
        shaTwoCpyBtn.setPreferredSize(new java.awt.Dimension(79, 25));
        shaTwoCpyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout shaTwoPnlLayout = new GroupLayout(shaTwoPnl);
        shaTwoPnl.setLayout(shaTwoPnlLayout);
        shaTwoPnlLayout.setHorizontalGroup(shaTwoPnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                shaTwoPnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(shaTwoLbl, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shaTwoCpyBtn, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));
        shaTwoPnlLayout.setVerticalGroup(shaTwoPnlLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                shaTwoPnlLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                shaTwoPnlLayout
                                        .createParallelGroup(
                                                GroupLayout.Alignment.BASELINE)
                                        .addComponent(shaTwoLbl,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(shaTwoCpyBtn,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                layout.createParallelGroup(
                                        GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mdFivePnl,
                                                GroupLayout.Alignment.LEADING,
                                                GroupLayout.DEFAULT_SIZE, 644,
                                                Short.MAX_VALUE)
                                        .addComponent(filePnl,
                                                GroupLayout.Alignment.LEADING,
                                                GroupLayout.DEFAULT_SIZE, 644,
                                                Short.MAX_VALUE)
                                        .addComponent(shaOnePnl,
                                                GroupLayout.DEFAULT_SIZE, 644,
                                                Short.MAX_VALUE)
                                        .addComponent(shaTwoPnl,
                                                GroupLayout.DEFAULT_SIZE, 644,
                                                Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(
                GroupLayout.Alignment.LEADING)
                .addGroup(
                        layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(filePnl,
                                        GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mdFivePnl,
                                        GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shaOnePnl,
                                        GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shaTwoPnl,
                                        GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));

        pack();
    }

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {
        fd.setAlwaysOnTop(true);
        fd.setVisible(true);
        if (null != fd.getFile()) {
            File file = new File(fd.getDirectory() + fd.getFile());
            filePathFld.setText(file.getAbsolutePath());

            final Hash hash = new Hash(file);

            new Thread(new Runnable() {
                public void run() {
                    mdFiveLbl.setText("Processing...");
                    mdFiveLbl.setText(hash.getMD5());
                    mdFiveCpyBtn.setEnabled(true);
                }
            }).start();

            new Thread(new Runnable() {
                public void run() {
                    shaOneLbl.setText("Processing...");
                    shaOneLbl.setText(hash.getSHA1());
                    shaOneCpyBtn.setEnabled(true);
                }
            }).start();

            new Thread(new Runnable() {
                public void run() {
                    shaTwoLbl.setText("Processing...");
                    shaTwoLbl.setText(hash.getSHA256());
                    shaTwoCpyBtn.setEnabled(true);
                }
            }).start();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        StringSelection ss = new StringSelection(mdFiveLbl.getText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        StringSelection ss = new StringSelection(shaOneLbl.getText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        StringSelection ss = new StringSelection(shaTwoLbl.getText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HashFileView().setVisible(true);
            }
        });

    }

}