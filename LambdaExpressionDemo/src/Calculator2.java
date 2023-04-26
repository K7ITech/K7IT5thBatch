
interface Calculator2 {
	int sub(int i,int j);
	}
	class Account implements Calculator2
	{
		//@override
		public int sub(int i,int j) {
			return i-j;
		}
		

}
