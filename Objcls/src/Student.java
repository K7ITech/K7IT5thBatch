
public class Student implements Cloneable {
	private int id;
	private String name;
	private Address add;
	public Student(int id,String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	public Student clone() {
		try {
			Student dup = (Student)super.clone();
			Address dupAdd = new Address(this.add.getdNo(), this.add.getStreet(), this.add.getPin());
			dup.add = dupAdd;
			return dup;
		}catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return null;
	}
	public Student getClone() {
		return this.clone();
	}
}
