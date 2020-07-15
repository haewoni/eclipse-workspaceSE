package com.itwill.member.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.itwill.member.MemberService;

public class LoginDialog extends JDialog {
	/*********************************************/
	private MemberService memberService;   //접근하기 위해서 선언
	private MemberServiceFrameMain frame;
	/*********************************************/
	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JPasswordField passTF;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public LoginDialog() {
		setBounds(100, 100, 415, 278);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(69, 50, 57, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(69, 106, 57, 15);
		contentPanel.add(lblNewLabel_1);
		
		idTF = new JTextField();
		idTF.setBounds(182, 47, 116, 21);
		contentPanel.add(idTF);
		idTF.setColumns(10);
		
		passTF = new JPasswordField();
		passTF.setBounds(182, 103, 116, 21);
		contentPanel.add(passTF);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							String id = idTF.getText();
							String password = String.copyValueOf(passTF.getPassword());   //배열로줌, 배열을 스트링으로 copyvalueof
							int result = memberService.login(id, password);
							if(result==0) {
								//로그인 성공
								frame.loginUI(id);
								frame.setTitle(id+"님 로그인");  //프레임 타이틀에 뜸
								frame.memberMainPanel.memberTapPane.setEnabledAt(0, true);    //메뉴(탭패인) 활성화
								
								dispose(); // 이너클래스에서 this 쓰면 에러 /  창닫기 기능
								
							}else if(result==1) {
								//아이디존재안함 or 틀림
								JOptionPane.showMessageDialog(null, "아이디 존재 안함 다시 해보세요");
								idTF.requestFocus();
								idTF.setSelectionStart(0);
								idTF.setSelectionEnd(id.length());
								
							}else if(result==2) {
								//비밀번호불일치
								JOptionPane.showMessageDialog(null, "비밀번호 불일치 다시 해보세요");
								idTF.requestFocus();
								passTF.setSelectionStart(0);
								passTF.setSelectionEnd(password.length());
							}
		
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
					
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		try {
			memberService = new MemberService();     //멤버서비스 생성자 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //end constructor

	public void setFrame(MemberServiceFrameMain memberServiceFrameMain) {
		this.frame = memberServiceFrameMain;
		
	}
	
}//end class
