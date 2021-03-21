public class StaticBlock{
	//static variable
	static int id = 30;

	//constructor
	StaticBlock(){
		System.out.println("constructor");
	}

	//static block
	static{
		System.out.println("id = " + id);
		System.out.println("id = " + id);
		System.out.println("id = " + id);
		System.out.println("id = " + id);
		System.out.println("id = " + id);
		System.out.println("static block1");

	}
}
