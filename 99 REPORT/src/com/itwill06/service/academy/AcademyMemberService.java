package com.itwill06.service.academy;
/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */

public class AcademyMemberService {
	//8개짜리 배열객체 생성
	private AcademyMember[] members={
			new AcademyStudent(1, "KIM", "자바"),
			new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "KIM", "자바"),
			new AcademyStudent(4, "LEE", "IOT"),
			new AcademyGangsa(5, "CHOI", "프로그래밍"),
			new AcademyGangsa(6, "KIM", "DB"),
			new AcademyGangsa(7, "DIM", "OS"),
			new AcademyStaff(8, "AIM", "영업"),
			new AcademyStaff(9, "QIM", "생산")
	};
	//getter
	public AcademyMember[] getMembers() {
		return members;
	}
	//print 메소드
	public void print() {
		for (int i = 0; i < members.length; i++) {
			AcademyMember academyMember = members[i];
			academyMember.print();
		}
	}
	//번호로 맴버 찾기 메소드
	public AcademyMember findAcademyMemberByNo(int no) {
		AcademyMember findMember=null; //배열 객체 생성,초기화
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==no) {
				findMember = members[i];  //객체 담기
				break;
			}
		}
		
		return findMember;  //반환
	}
	
	//이름으로 멤버 찾기 메소드
	public AcademyMember[] findAcademyMemberByName(String name) {
		AcademyMember[] findMembers=null;  //배열 객체 생성, 초기화
		//1. 만족하는 계좌 개수 구하기
		int count = 0; //계좌 개수 셀 정수 타입 변수 선언
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				count++; //찾을때 마다 하나 증가
			}
		}				
		//2. 계좌 배열 담기
		findMembers = new AcademyMember[count];  //찾은 계좌 개수 크기의 배열객체 생성
		int index = 0 ; //배열에 객체 주소 담을 길이,횟수 돌리기 
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				findMembers[index] = members[i];  //index 크기 findMembers배열객체에 조건 만족하는 객체 담기
				index++; // 만족하는 객체 배열 크기 만큼 돌리기
			}
		}
		return findMembers;  //반환
	}

	/*
	 * 강사 or 학생 or Staff들 반환( instanceof연산자)
	 * 	
	 */
	public AcademyMember[] findAcademyStudents(){ //배열객체 메소드 생성
		AcademyMember[] students=null; //멤버타입 학생 객체 초기화
		int count=0; // 학생수 세기
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				count++; 
			}
		}
		students=new AcademyMember[count];  //학생수에 맞는 배열객체 생성
		int index=0; 
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				students[index]=members[i];
				index++;
			}
		}
		return students;
	}
	
	
	public AcademyMember[] findAcademyGangsas(){
		AcademyMember[] gangsas = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		gangsas=new AcademyMember[count];
		int index= 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				gangsas[index] = members[i];
				index++;
			}
		}
		return gangsas;
		
	}
	
	public AcademyMember[] findAcademyStaffs(){
		AcademyMember[] staffs = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		staffs = new AcademyMember[count];
		
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				staffs[index] = members[i];
				index++;
			}
		}
		return staffs;
	}
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	
	/*
	public AcademyMember[] findAcademyStudentsByBan(String ban) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsasBySubject(String subject) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyMember[] findAcademyStaffsByDepart(String depart) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	*/
	/*
	 * 자바반     학생들 찾아서 반환해줘 
	 * 리눅스과목 강사들 찾아서 반환해줘 
	 * 영업부서   스텝들 찾아서 반환해줘 
	 */
	public AcademyMember[] findByAcademyMembers(int type,String searchStr) {
		AcademyMember[] findMembers=null;
		return findMembers;
	} 
	/*
	public AcademyMember[] findByAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		return findMembers;
	} 
	*/
}
