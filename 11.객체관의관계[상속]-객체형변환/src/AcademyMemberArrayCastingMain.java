
public class AcademyMemberArrayCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
				new AcademyStudent(1,"KIM","JAVA"),
				new AcademyStudent(2,"LIM","KAVA"),
				new AcademyStudent(1,"MIM","LAVA"),
				new AcademyGangsa(4,"FIM","C"),
				new AcademyGangsa(5,"FIM","C++"),
				new AcademyStaff(6,"KANG","MARKETING"),
				new AcademyStaff(6,"KING","CEO")
		};
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}

	}

 }

