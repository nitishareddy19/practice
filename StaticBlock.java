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
		System.out.println("static block1");
		System.out.println("static block2");
		System.out.println("static block3");
		System.out.println("static block4");
	}
}
