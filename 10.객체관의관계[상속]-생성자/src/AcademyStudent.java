public class AcademyStudent extends AcademyMember {
	public String ban;

	public AcademyStudent() {
	}

	public AcademyStudent(int no, String name,String ban) {
		/*
		 * <<상속 받은 private member 접근 불가능>>
		 * this.no=no;
		 * this.name=name;
		 */
		/*
		 * <<상속 받은 method 통해 접근 가능>>
		 * this.setNo(no);
		 * this.setName(name);
		 */
		super(no,name);		
		this.ban = ban;
	}
    @Override
	public void print() {
		super.print();
		System.out.println(ban);
				
	}
	
	
	
	
	
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	

}
