package 复习;

public class 注解 {
	@Configuration于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被
@Bean注解的方法，这些方法将会被AnnotationConfigApplicationContext或
AnnotationConfigWebApplicationContext类进行扫描，并用于构建bean定义，
初始化Spring容器。

	@Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在
@Component注解的类里。添加的bean的id为方法名.使用@Bean注解的好处就是能够动
态获取一个Bean对象，能够根据环境不同得到不同的Bean对象。或者说将Spring和其他组
件分离

	@EnableSwagger2注解来启动Swagger2
	
	Swagger2 的注解使用
	@Api：用在类上，说明该类的作用。
	@ApiOperation：注解来给API增加方法说明。
	@ApiImplicitParams : 用在方法上包含一组参数说明。
	@ApiImplicitParam：用来注解来给方法入参增加说明。
		paramType：指定参数放在哪个地方
		name：参数名
		dataType：参数类型
		required：参数是否必须传
		value：说明参数的意思
		defaultValue：参数的默认值
	@ApiResponses：用于表示一组响应
	@ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
	    *  code：数字，例如400
	    *  message：信息，例如"请求参数没填好"
	    *  response：抛出异常的类   
	@ApiModel：描述一个Model的信息（一般用在请求参数无法使用@ApiImplicitParam
注解进行描述的时候）
	    *  @ApiModelProperty：描述一个model的属性
	
	    
    @RequiresAuthentication验证用户是否登录，等同于方法subject.isAuthenticated() 结果为true时。
	
    @PathVariable在参数中提醒他是requestmapping的{}变量
}


 @Configuration配置   ConfigBean = applicationContext.xml
