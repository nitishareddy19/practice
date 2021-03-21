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
		System.out.println("static block5");
                System.out.println("static block6");
		System.out.println("static block7");
		System.out.println("static block8");
	}
}
