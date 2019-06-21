package 复习;

public class mabatis {
	MyBatis是支持普通SQL查询，存储过程和高级映射的优秀持久层框架。MyBatis消除
了几乎所有的JDBC代码和参数的手工设置以及结果集的检索。MyBatis使用简单的XML
或注解用于配置和原始映射，将接口和Java的POJOs（Plan Old Java Objects，普通
的Java对象）映射成数据库中的记录。

	mybatis通过读取配置文件信息（全局配置文件和映射文件），构造出SqlSessionFactory，
即会话工厂。
	通过SqlSessionFactory，可以创建SqlSession即会话。Mybatis是通过SqlSession来
操作数据库的。
	SqlSession本身不能直接操作数据库，它是通过底层的Executor执行器接口来操作数据
库的。Executor接口有两个实现类，一个是普通执行器，一个是缓存执行器（默认）。
	
	Executor执行器要处理的SQL信息是封装到一个底层对象MappedStatement中。该对象包括：
SQL语句、输入参数映射信息、输出结果集映射信息。其中输入参数和输出结果的映射类型包括
java的简单类型、HashMap集合对象、POJO对象类型。

	MyBatis应用程序根据XML配置文件创建SqlSessionFactory，SqlSessionFactory在根据配置，
配置来源于两个地方，一处是配置文件，一处是Java代码的注解，获取一个SqlSession。SqlSession
包含了执行sql所需要的所有方法，可以通过SqlSession实例直接运行映射的sql语句，完成对数据的
增删改查和事务提交等，用完之后关闭SqlSession。

	SELECT DATABASE()查询当前所使用的数据库
}
















