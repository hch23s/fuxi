package 复习;

public class 基础 {

		java的语言特点：
			免费开源的:开放源代码;
			安全:
			面向对象的:后面学习
			跨平台的:因为jvm java虚拟机	
		
		JRE：Java运行时环境;运行Java程序的;包括:JVM + Java的核心类库;
		JDK：Java开发者工具包;开发Java程序的,给开发者用的;包括:和Java开发有关的工具,和JRE;
	
		switch支持byte（1）,short（2）,int（4）,enum,String,char,
	不支持long8和布尔类型boolean,float,double
	
		break结束当前循环，countinue结束本次循环
	
		Java中，所有函数都是在栈内存中执行的，都是通过return关键字出栈的；
		栈内存的特点是先进后出；正在执行的函数一定是位于栈顶的函数，在栈底的函数一定是main函数；
		当main函数出栈，整个程序也将结束运行；
	
		重载：在同一个类中，可以定义多个名称相同、参数列表不同的函数，；

		数组元素的存放和取出，都是通过数组的索引实现的；
	
		java内存空间
			寄存器：给CPU用的，不用关心
			本地方法去：和操作系统有关，不用关心
			方法区：保存静态的和class
			栈内存：先进后出，函数执行的地方，和堆相比效率更高
			堆内存：主要存放实体数据，比栈效率低，保存在堆中的数据都有默认值
			
		jvm在执行时，一旦遇到new关键字，就会去堆内存中开辟空间
		变量中保存的内存地址，又叫做堆空间中实体的引用
		当堆内存中的实体不被任何变量引用时，就会变成垃圾空间， 等待java的垃圾
	回收机制回收，回收之后，才会释放空间
	
		引用传递；引用类型的变量进行传参，实际传递的是保存在变量中指向堆中空间的地址，
		值传递：基本类型的变量进行传参，实际传递的保存在变量中的常量值
		
		面向过程的优点：在需求简单的时候，程序结构简单，流程清晰；
		弊端：如果需求复杂，功能太多，使用面向过程编程，就会非常的复杂，开发困难，维护更困难；
		Java程序中的对象：指的是通过new关键字在堆内存中开辟的一块空间；
		面向过程：关心的是事件中的每一步的功能怎么做； 
		面向对象:关心的是事件中的每一步功能有没有什么对象已经实现好了，直接拿来使用。
		
		类是用来描述同一类事物的共性信息的（包括属性和特征）
		具体事物的信息，用类的一个对象来描述
		对象是通过类创建的，先有类，然后才有对象；

		成员变量： 直接定义在类中的变量 直接定义在类的变量，在堆内存中
		局部变量： 定义在类中局部位置（函数中）的变量 直接定义在函数的变量，在栈内存中
		局部变量：随着函数进栈执行，开始分配空间；函数之行结束出栈，空间被回收
		成员变量：随着创建对象开始分配空间；随着对象的空间变成垃圾空间被回收而被回收；
		
		封装，就是包装，可以隐藏事物的细节信息；同时为了外界能够访问这些细节，还需要提供公开的访问方法；
		封装的好处：可以提高程序的安全性、复用性、易用性；
		
		非静态函数可以调用静态函数；
		静态函数不能使用非静态成员变量，但可以使用静态成员变量；
		静态成员变量放在方法区的静态区域中，不管创建一个类的多少实例对象，静态的成员变量，在这些对象
	中都是共享的，所以可以解决上面出现的空间浪费的问题；
		a)静态成员变量：方法区的静态区域
		b)非静态成员变量：堆内存中
		3、从生命周期上看：
		a)静态成员变量：类加载的时候，开始分配空间，类卸载的时候；
		b)非静态成员变量：创建对象的时候分配空间；对象被回收的时候；

		如果在子类中定义了和父类中一样的成员函数，在子类对象中使用的就是子类中定义的函数，这种情况叫做方法的重写（覆写）；
		抽象类，必须由子类去继承，继承的子类必须实现父类中所有的抽象方法；
		
		使用父类型引用指向子类对象，不能通过父类性引用访问子类特有属性和行为；
		1、接口可以描述事物不属于继承体系中的扩展的功能；
		2、通过多态的方式使用接口，可以提高程序的扩展性；
		3、接口实现了java中的多继承；
		1、从声明上：
		i.抽象类是一个类，使用class声明；还需要使用关键字abstract修饰；
		ii.接口不是一个类，使用interface声明；
		2、从能够书写的成员上看：
		i.抽象类是一个类，可以书写类中可以书写的成员，和抽象函数；
		ii.接口只能书写成员变量和抽象函数，而且修饰符是固定的；
		3、从有无构造函数上看：
		i.抽象类必须有构造函数；
		ii.接口没有构造函数
		4、从作用上看：
		i.抽象类是父类，用来描述所有子类的共性信息的，只是描述的有些功能是不具体的；
		ii.接口是用来描述不属于继承体系的扩展功能的；还可以定义规则；
		5、继承关系上：
		i.抽象类和类之间是继承关系，只支持但继承和多重继承；
		ii.接口和类之间是实现关系，一个实现类可以实现多个接口；
		接口和接口之间是继承关系，可以多继承和多重继承；
		
		
		
		
		
		
		