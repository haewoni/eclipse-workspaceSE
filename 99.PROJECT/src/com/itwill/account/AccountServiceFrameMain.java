package com.itwill.account;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AccountServiceFrameMain extends JFrame {
	private AccountService accountService;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JPanel panel;
	private JTextField noTF;
	private JTextField ownerTF;
	private JTextField balanceTF;
	private JTextField iyulTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountServiceFrameMain frame = new AccountServiceFrameMain();
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
	public AccountServiceFrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("계좌추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(noTF.getText());
				String owner = ownerTF.getText();
				int balance = Integer.parseInt(balanceTF.getText());
				double iyul = Double.parseDouble(iyulTF.getText());
				Account account = new Account(no, owner, balance, iyul);
				
				if(accountService.addAccount(account)) {
					JOptionPane.showMessageDialog(null, "add success");
					ArrayList<Account> accountList =
							accountService.findByAll();
					System.out.println(accountList);
				}else {
					JOptionPane.showMessageDialog(null, "add fail");
					
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		noTF = new JTextField();
		noTF.setBounds(142, 30, 116, 21);
		panel.add(noTF);
		noTF.setColumns(10);
		
		ownerTF = new JTextField();
		ownerTF.setBounds(142, 80, 116, 21);
		panel.add(ownerTF);
		ownerTF.setColumns(10);
		
		balanceTF = new JTextField();
		balanceTF.setBounds(142, 126, 116, 21);
		panel.add(balanceTF);
		balanceTF.setColumns(10);
		
		iyulTF = new JTextField();
		iyulTF.setBounds(142, 169, 116, 21);
		panel.add(iyulTF);
		iyulTF.setColumns(10);
		try {
			accountService = new AccountService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
