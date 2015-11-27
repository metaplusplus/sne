package meta.morphosis.frames;
/**
 * 
 * @author metamorphosis (meta++)
 * @author Ramiz Abdullayev
 * @version 1.0.0.0
 * https://github.com/metaplusplus/sse
 * 
 * 
 * Copyright 2015 Ramiz Abdullayev
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;

import meta.morphosis.metodlar;

import javax.swing.JTextField;
//import javax.swing.JButton;
import java.awt.Color;
//import javax.swing.JToolBar;
//import javax.swing.JTabbedPane;
//import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
//import javax.swing.JPopupMenu;
//import java.awt.Component;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.Font;
import java.awt.Toolkit;
//import javax.swing.BoxLayout;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import java.awt.Window.Type;
import javax.swing.JLabel;
//import javax.swing.DropMode;
import javax.swing.SwingConstants;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.UIManager;


public class MFrame extends JFrame {
	private JTextField txtMetamorphosis;
	private JTextField textField_md5;
	private JTextField textField_base64;
	private JTextField textField_hex;
	private JTextField textField_char;
	private JTextField textField_sha1;
	private JTextField textField_sha256;
	private JTextField textField_sha512;
	private JTextField textField_ucrypt;
	private JTextField textField_md2;
	private JTextField textField_sha384;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MFrame frame = new MFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MFrame() {
		getContentPane().setBackground(new Color(235, 235, 235));
		//getContentPane().setBackground(UIManager.getColor("Button.highlight"));
		setResizable(false);
		setTitle("SSE - Super Simple Encoder");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MFrame.class.getResource("/meta/morphosis/img/logo_80x80.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//LOOK! WATCH IT! 
		/*
		 * 
		 * setBounds(100, 100, 387, 470);
		 * 
		 */
		setBounds(100, 100, 387, 470);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		//menuBar.setBackground(Color.WHITE);
		menuBar.setForeground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmNewMenuItem.setSelectedIcon(new ImageIcon(MFrame.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\adsf\\Desktop\\favicon.ico"));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmRestart = new JMenuItem("Restart");
		mntmRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				meta.morphosis.frames.Splashframe.main(200);
			}
		});
		mntmRestart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnFile.add(mntmRestart);
		mnFile.add(mntmNewMenuItem);
		
		JMenu mnMode = new JMenu("Mode");
		mnMode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(mnMode);
		JRadioButtonMenuItem rdbtnmntmBig = new JRadioButtonMenuItem("Big");
		rdbtnmntmBig.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JRadioButtonMenuItem rdbtnmntmMinimal = new JRadioButtonMenuItem("Minimal");
		rdbtnmntmMinimal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnmntmMinimal.setSelected(true);
		
		rdbtnmntmMinimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 387, 470);
				setLocationRelativeTo(null);
				rdbtnmntmBig.setSelected(false);
			}
		});
		mnMode.add(rdbtnmntmMinimal);
		
		//JRadioButtonMenuItem rdbtnmntmBig = new JRadioButtonMenuItem("Big");
		rdbtnmntmBig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setBounds(100, 100, 757, 470);
				setLocationRelativeTo(null);
				rdbtnmntmMinimal.setSelected(false);
			}
		});
		mnMode.add(rdbtnmntmBig);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		mnNewMenu_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmWikipedia = new JMenuItem("Wikipedia");
		mntmWikipedia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmWikipedia);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "About JFrame works!");
				About.main(null);
				
			}
		});
		mntmAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnNewMenu_1.add(mntmAbout);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 361, 401);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtMetamorphosis = new JTextField();
		txtMetamorphosis.setBounds(78, 28, 250, 23);
		panel.add(txtMetamorphosis);
		txtMetamorphosis.setText("The free man is a warrior. - Nietzsche");
		txtMetamorphosis.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
				 String text = txtMetamorphosis.getText();
				 if(text != null && !text.isEmpty()) {
					
					 textField_md5.setText(metodlar.Do_md5(text));
					 textField_base64.setText(metodlar.Do_enBase64(text));
					 textField_hex.setText(metodlar.Do_hex(text));
					 textField_char.setText(metodlar.Do_char(text));
					 textField_sha1.setText(metodlar.Do_sha1(text));
					 textField_sha256.setText(metodlar.Do_sha256(text));
					 textField_sha512.setText(metodlar.Do_sha512(text));
					 textField_ucrypt.setText(metodlar.Do_ucrypt(text));
					 textField_md2.setText(metodlar.Do_md2(text));
					 textField_sha384.setText(metodlar.Do_sha384(text));
					 
					 
					 
				 } else {
					 textField_md5.setText("");
					 textField_base64.setText("");
					 textField_hex.setText("");
					 textField_char.setText("");
					 textField_sha1.setText("");
					 textField_sha256.setText("");
					 textField_sha512.setText("");
					 textField_ucrypt.setText("");
					 textField_md2.setText("");
					 textField_sha384.setText("");
					  }
				 
				 
				 
				
				 
				 
				 
				} catch(Exception errst){ JOptionPane.showMessageDialog(null, "Error: "+errst+".");}
			}
		});
		txtMetamorphosis.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Text");
		lblNewLabel.setBounds(10, 32, 58, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_md5 = new JTextField();
		textField_md5.setBounds(78, 78, 250, 20);
		panel.add(textField_md5);
		textField_md5.setBackground(Color.WHITE);
		textField_md5.setEditable(false);
		textField_md5.setColumns(10);
		
		JLabel lblMd = new JLabel("MD5");
		lblMd.setBounds(10, 81, 58, 14);
		panel.add(lblMd);
		lblMd.setHorizontalAlignment(SwingConstants.RIGHT);
		//lblMd.setForeground(Color.WHITE);
		lblMd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_md2 = new JTextField();
		textField_md2.setBounds(78, 109, 250, 20);
		panel.add(textField_md2);
		textField_md2.setBackground(Color.WHITE);
		textField_md2.setEditable(false);
		textField_md2.setColumns(10);
		
		textField_sha1 = new JTextField();
		textField_sha1.setBounds(78, 140, 250, 20);
		panel.add(textField_sha1);
		textField_sha1.setBackground(Color.WHITE);
		textField_sha1.setEditable(false);
		textField_sha1.setColumns(10);
		
		textField_sha256 = new JTextField();
		textField_sha256.setBounds(78, 171, 250, 20);
		panel.add(textField_sha256);
		textField_sha256.setBackground(Color.WHITE);
		textField_sha256.setEditable(false);
		textField_sha256.setColumns(10);
		
		textField_sha384 = new JTextField();
		textField_sha384.setBounds(78, 202, 250, 20);
		panel.add(textField_sha384);
		textField_sha384.setBackground(Color.WHITE);
		textField_sha384.setEditable(false);
		textField_sha384.setColumns(10);
		
		textField_sha512 = new JTextField();
		textField_sha512.setBounds(78, 233, 250, 20);
		panel.add(textField_sha512);
		textField_sha512.setBackground(Color.WHITE);
		textField_sha512.setEditable(false);
		textField_sha512.setColumns(10);
		
		textField_ucrypt = new JTextField();
		textField_ucrypt.setBounds(78, 264, 250, 20);
		panel.add(textField_ucrypt);
		textField_ucrypt.setBackground(Color.WHITE);
		textField_ucrypt.setEditable(false);
		textField_ucrypt.setColumns(10);
		
		textField_base64 = new JTextField();
		textField_base64.setBounds(78, 295, 250, 20);
		panel.add(textField_base64);
		textField_base64.setBackground(Color.WHITE);
		textField_base64.setEditable(false);
		textField_base64.setColumns(10);
		
		textField_hex = new JTextField();
		textField_hex.setBounds(78, 326, 250, 20);
		panel.add(textField_hex);
		textField_hex.setBackground(Color.WHITE);
		textField_hex.setEditable(false);
		textField_hex.setColumns(10);
		
		textField_char = new JTextField();
		textField_char.setBounds(78, 357, 250, 20);
		panel.add(textField_char);
		textField_char.setBackground(Color.WHITE);
		textField_char.setEditable(false);
		textField_char.setColumns(10);
		
		JLabel lblMd_1 = new JLabel("MD2");
		lblMd_1.setBounds(10, 112, 58, 14);
		panel.add(lblMd_1);
		lblMd_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//lblMd_1.setForeground(Color.WHITE);
		lblMd_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblSha = new JLabel("SHA1");
		lblSha.setBounds(10, 143, 58, 14);
		panel.add(lblSha);
		lblSha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//lblSha.setForeground(Color.WHITE);
		lblSha.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblSha_1 = new JLabel("SHA256");
		lblSha_1.setBounds(10, 174, 58, 14);
		panel.add(lblSha_1);
		lblSha_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//lblSha_1.setForeground(Color.WHITE);
		lblSha_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblSha_2 = new JLabel("SHA384");
		lblSha_2.setBounds(10, 205, 58, 14);
		panel.add(lblSha_2);
		lblSha_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//lblSha_2.setForeground(Color.WHITE);
		lblSha_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_2 = new JLabel("SHA512");
		lblNewLabel_2.setBounds(10, 236, 58, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblUnixCrypt = new JLabel("Unix Crypt");
		lblUnixCrypt.setBounds(10, 267, 58, 14);
		panel.add(lblUnixCrypt);
		lblUnixCrypt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//lblUnixCrypt.setForeground(Color.WHITE);
		lblUnixCrypt.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblBase = new JLabel("Base64");
		lblBase.setBounds(10, 298, 58, 14);
		panel.add(lblBase);
		lblBase.setHorizontalAlignment(SwingConstants.RIGHT);
		//lblBase.setForeground(Color.WHITE);
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblHex = new JLabel("Hex");
		lblHex.setBounds(10, 329, 58, 14);
		panel.add(lblHex);
		lblHex.setHorizontalAlignment(SwingConstants.RIGHT);
		//lblHex.setForeground(Color.WHITE);
		lblHex.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Char");
		lblNewLabel_1.setBounds(10, 360, 58, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(381, 11, 361, 203);
		getContentPane().add(panel_1);
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea.setBounds(78, 82, 250, 112);
		panel_1.add(textArea);
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String s = textField.getText();
				
				
				
				textArea.setText(meta.morphosis.metodlar.Do_decBase64(s));
				
				
			}
		});
		textField.setColumns(10);
		textField.setBounds(78, 28, 250, 23);
		panel_1.add(textField);
		
		JLabel label = new JLabel("Text");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(10, 32, 58, 14);
		panel_1.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Base64_decode", "Anything else"}));
		comboBox.setBounds(218, 56, 110, 20);
		panel_1.add(comboBox);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(381, 225, 361, 187);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
	}
}
