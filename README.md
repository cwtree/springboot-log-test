# springboot-log-test
springboot-log-test

this project doesn't produce any log file under the project dir

but but but 

if I change the 

		<parent>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-parent</artifactId>
				<version>2.3.8.RELEASE</version>
				<relativePath /> <!-- lookup parent from repository -->
		</parent>

  
  to 
  
		<parent>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-parent</artifactId>
				<version>2.4.3</version>
				<relativePath /> <!-- lookup parent from repository -->
		</parent>

  
  
it works,${project_home}/logs/mytest.log produced
  
so what's wrong with springboot log ?
the following is the logging reference
>>https://docs.spring.io/spring-boot/docs/2.4.3/reference/html/spring-boot-features.html#boot-features-logging
