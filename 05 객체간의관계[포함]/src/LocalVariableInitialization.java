
public class LocalVariableInitialization {
	private int no;
	private String name;
	public LocalVariableInitialization() {
		// TODO Auto-generated constructor stub
	}
	public LocalVariableInitialization(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.println(">>\t"+this.no+"\t"+this.name);
	}

}
