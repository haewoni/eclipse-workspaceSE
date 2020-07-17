package com.itwill.member.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MemberMainPanel extends JPanel {
	/*****************************************************/
	MemberService memberService;
	boolean isUpdate = false; //초기상태, true는 업뎃
	/*****************************************************/
	JTabbedPane memberTapPane;
	private JTable memberTBL;
	private JList memberListL;
	private JComboBox memberCB;
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField ageTF;
	private JCheckBox marriedCHK;
	private JButton deleteBtn;
	private JButton updateBtn;
	

	/**
	 * Create the panel.
	 */
	public MemberMainPanel() {
		setLayout(new BorderLayout(0, 0));
		
		memberTapPane = new JTabbedPane(JTabbedPane.TOP);
		
		add(memberTapPane, BorderLayout.CENTER);
		
		JPanel logoP = new JPanel();
		memberTapPane.addTab("로고", null, logoP, null);
		logoP.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\stu03\\Desktop\\w.png"));
		logoP.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel memberListP = new JPanel();
		memberListP.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					getMemberList();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		/*memberListP.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("focusGained");
			}
		});
		*/
		memberListP.setBackground(Color.ORANGE);
		memberTapPane.addTab("회원리스트", null, memberListP, null);
		memberListP.setLayout(null);
		
		memberCB = new JComboBox();
		memberCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {  //상태변경 2번씩 발생
				if(e.getStateChange()==ItemEvent.SELECTED) {
					String selectId = (String)e.getItem();
					System.out.println(selectId);
					try {
						displayMember(selectId);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		memberCB.setModel(new DefaultComboBoxModel(new String[] {"xxx", "yyy", "aaa", "bbb", "ccc"}));
		memberCB.setBounds(28, 32, 92, 21);
		memberListP.add(memberCB);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 75, 92, 138);
		memberListP.add(scrollPane);
		
		memberListL = new JList();
		
		memberListL.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		memberListL.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					String selectId = (String)memberListL.getSelectedValue();
					//System.out.println(selectId);
					try {
						displayMember(selectId);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		/*memberListL.setModel(new AbstractListModel() {
			String[] values = new String[] {"xxxx", "bbb", "ccc", "yyy", "zzz"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		*/
		scrollPane.setViewportView(memberListL);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(132, 32, 319, 113);
		memberListP.add(scrollPane_1);
		
		memberTBL = new JTable();
		memberTBL.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		memberTBL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectRow = memberTBL.getSelectedRow();
				if(selectRow==-1) {  //선택되지 않았을때
					return;
				}
				String selectedId = 
						(String)memberTBL.getModel().getValueAt(selectRow, 0);
				
				try {
					displayMember(selectedId);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		memberTBL.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uC774\uB984", "\uB098\uC774", "\uC8FC\uC18C", "\uACB0\uD63C \uC5EC\uBD80"
			}
		));
		scrollPane_1.setViewportView(memberTBL);
		
		JButton btnNewButton = new JButton("멤버리스트");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					getMemberList();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(23, 223, 97, 23);
		memberListP.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(188, 189, 57, 15);
		memberListP.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(188, 230, 57, 15);
		memberListP.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(188, 274, 57, 15);
		memberListP.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(188, 320, 57, 15);
		memberListP.add(lblNewLabel_4);
		
		idTF = new JTextField();
		idTF.setEnabled(false);
		idTF.setEditable(false);
		idTF.setBounds(290, 186, 116, 21);
		memberListP.add(idTF);
		idTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setEditable(false);
		nameTF.setBounds(290, 230, 116, 21);
		memberListP.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setEditable(false);
		addressTF.setBounds(290, 271, 116, 21);
		memberListP.add(addressTF);
		addressTF.setColumns(10);
		
		ageTF = new JTextField();
		ageTF.setEditable(false);
		ageTF.setBounds(290, 317, 116, 21);
		memberListP.add(ageTF);
		ageTF.setColumns(10);
		
		marriedCHK = new JCheckBox("결혼 여부");
		marriedCHK.setBounds(188, 365, 218, 23);
		memberListP.add(marriedCHK);
		
		deleteBtn = new JButton("삭제");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteMember();
			}
		});
		deleteBtn.setEnabled(false);
		deleteBtn.setBounds(309, 415, 97, 23);
		memberListP.add(deleteBtn);
		
		updateBtn = new JButton("수정");   //2가지 기능, 라벨로도 가능
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					updateMember();
					
					getMemberList();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		updateBtn.setEnabled(false);
		updateBtn.setBounds(200, 415, 97, 23);
		memberListP.add(updateBtn);
		
		try {
			memberService = new MemberService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} //생성

	}
/**************************************************************************/
	protected void updateMember() {
		try {
		if(!isUpdate) {   //edit 상태인지 아닌지
			// update .edit 풀어주기
			nameTF.setEditable(true);
			addressTF.setEditable(true);
			ageTF.setEditable(true);
			nameTF.setEditable(true);
			marriedCHK.setEnabled(true);
			nameTF.requestFocus();
			isUpdate = true;
			updateBtn.setText("수정완료");  //버튼 문구 변경
		}else {
			String id = idTF.getText();
			String name = nameTF.getText();
			String address = addressTF.getText();
			String ageStr = ageTF.getText();
			boolean married = marriedCHK.isSelected();
		
			
			memberService.memberUpdate(new Member(
					id,id,name,address,Integer.parseInt(ageStr),married));
			
			// edit가능 
			nameTF.setEditable(false);
			addressTF.setEditable(false);
			ageTF.setEditable(false);
			nameTF.setEditable(false);
			marriedCHK.setEnabled(false);
			nameTF.requestFocus(); //이것도 다시?
			isUpdate = false;
			updateBtn.setText("수정"); 
		}
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		
	}

	protected void deleteMember() {
		try {
			String deleteId = idTF.getText();
			if(deleteId==null || deleteId.equals("")) return;
			memberService.memberUnRegister(deleteId);
			
			/*****************************************************/
			idTF.setText("");
			nameTF.setText("");
			addressTF.setText("");
			ageTF.setText("");   //int--->String 아니면 String.valueOf
			marriedCHK.setSelected(false);
			updateBtn.setEnabled(false);
			deleteBtn.setEnabled(false);
			/*****************************************************/
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void displayMember(String selectId) throws Exception {
		Member findMember = 
				memberService.findById(selectId);
		
		idTF.setText(findMember.getId());
		nameTF.setText(findMember.getName());
		addressTF.setText(findMember.getAddress());
		ageTF.setText(findMember.getAge()+"");   //int--->String 아니면 String.valueOf
		if(findMember.isMarried()) {
			marriedCHK.setSelected(true);
		}else {
			marriedCHK.setSelected(false);
			
		}
		updateBtn.setEnabled(true);
		deleteBtn.setEnabled(true);
		
	}

	protected void getMemberList() throws Exception{
		ArrayList<Member> memberList = memberService.memberList();	
		/*
		 * JList Model
		 */
		DefaultListModel listModel = new DefaultListModel();
		/*
		 * JComboBox Model
		 */
		DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
		/*
		 * JTable Model
		 */
		DefaultTableModel tableModel = new DefaultTableModel();
		Vector columnVector = new Vector();
		columnVector.add("아이디");
		columnVector.add("이름");
		columnVector.add("주소");
		columnVector.add("나이");
		columnVector.add("결혼여부");
		tableModel.setColumnIdentifiers(columnVector);
		
		for (Member member : memberList) {
			listModel.addElement(member.getId());
			comboBoxModel.addElement(member.getId());
			Vector rowVector = new Vector();
			rowVector.add(member.getId());
			rowVector.add(member.getName());
			rowVector.add(member.getAddress());
			rowVector.add(member.getAge());
			rowVector.add(member.isMarried());
			
			tableModel.addRow(rowVector);
			
		}
		memberListL.setModel(listModel);
		memberCB.setModel(comboBoxModel);
		memberTBL.setModel(tableModel);
		
		
		
		
		
	}
}
