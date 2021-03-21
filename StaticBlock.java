public class StaticBlock{
	//static variable
	static int id = 30;
        static String name="rama";

	//constructor
	StaticBlock(){
		System.out.println("constructor");
	}

	//static block
	static{
		System.out.println("id = " + id);
<<<<<<< HEAD
		System.out.println("static block0");
                System.out.println("static block1");
                System.out.println("static block2");
                System.out.println("static block3");
=======
		System.out.println("static block1");
		System.out.println("static block2");
		System.out.println("static block3");
		System.out.println("static block4");
               System.out.println("name= " + name);
		

>>>>>>> d58bfa3cc7452538b03f96fa622c0c9ba2f428e3
	}
}
