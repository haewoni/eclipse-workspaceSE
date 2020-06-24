public class AcademyMember extends Object {
	private int no;
	private String name;
	
	public void print( ) {
		System.out.print(no+"\t"+name+"\t");
	}
	
	public AcademyMember() {
		super();		
	}

	public AcademyMember(int no, String name) {
		
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
