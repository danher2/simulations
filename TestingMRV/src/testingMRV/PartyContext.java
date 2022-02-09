package testingMRV;

public class PartyContext {
	
	private int id;
	private String name;
	
	public PartyContext() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PartyContext(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "PartyContext [id=" + id + ", name=" + name + "]";
	}
	
	

}
