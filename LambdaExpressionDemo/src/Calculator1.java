
interface Calculator1 {
	int add(int i,int j);
}
class Accounts implements Calculator1
{
	//@override
	public int add(int i,int j) {
		return i+j;
	}
	
}
