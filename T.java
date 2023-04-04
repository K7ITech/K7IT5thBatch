class T{
        T(){
		this(22.23);
		System.out.println("no arg constructor");
		}
		T(int i){	
		System.out.println("int type constructor : "+i);
		}
		T(double d){
		System.out.println("double type constructor : "+d);
		}
		public static void main(String args[]){
		T t1 = new T();
		T t2 = new T(20);
		}
}