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
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(members[i].getName())) {
				findMembers = members[i];
			}
		}
	}
	return findMembers;
	/*
	 * 강사 or 학생 or Staff들 반환( instanceof연산자)
	 * 	
	 */
	public AcademyMember[] findAcademyStudents(){
		AcademyMember[] students=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				count++;
			}
		}
		students=new AcademyMember[count];
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
		return null;
	}
	public AcademyMember[] findAcademyStaffs(){
		return null;
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
