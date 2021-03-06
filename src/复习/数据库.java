package 复习;

public class 数据库 {
		事务特性
			原子性：强调事务的不可分割
			一致性：强调的是事务的执行的前后，数据的完整性要保持一致
			隔离性：一个事务的执行不应该受到其他事务的干扰
			持久性：事务一旦结束(提交/回滚)数据就持久保持到了数据库
			
		如果不考虑隔离性，会引发一些安全性问题
			读问题
			脏读：一个事务读到另一个事务还没有提交的数据
			不可重复读：一个事务读到了另一个事务已经提交的update数据，导致在当前的事务中多次查询数据不一致
			虚读/幻读：一个事务读到另一个事务已经insert数据，导致当前事务中多次查询结果不一致
			写问题
			引发两类丢失更新
			
		对于数据的操作，hibernate是面向对象的，而MyBatis是面向关系的	
		
		关系型数据库：指采用了关系模型来组织数据的数据库。
		关系模型指的就是二维表格模型，而一个关系型数据库就是由二维表及
	其之间的联系所组成的一个数据组织。
		非关系型数据库：指非关系型的，分布式的，且一般不保证遵循ACID原则的数据存储系统。
		非关系型数据库结构:非关系型数据库以键值对存储，且结构不固定，每一个元组可以有
	不一样的字段，每个元组可以根据需要增加一些自己的键值对，不局限于固定的结构，可以
	减少一些时间和空间的开销
}







