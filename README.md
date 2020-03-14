需求
教师：
  登录；导入多门课程成绩单excel表格（js实现）  加专业方向、权重
  为课程设置最低分数/权重；保密算法
  设置实际指导学生数
  设置加权后，有资格学生数范围
  查看当前已接受学生
  各参数可修改

学生：
  输入学号；提名；载入曾经选修的课程;\
  提交，提醒确认（不可修改）;\
  匹配，返回成功说明，更新数据；匹配不成功，返回友好失败提醒信息\
  达到最大数，关闭提交，显示提醒信息;\
  后台并发判断;\
  
  
  
  
  application.properties 配置
  #########datasource
  spring.datasource.url=jdbc:mysql://localhost:3306/jpatest?createDatabaseIfNotExist=true\
    &serverTimezone=UTC
  spring.datasource.username=root
  spring.datasource.password=root
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  ##########jpa
  spring.jpa.show-sql=true
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
  ##########log
  logging.level.root=warn
  #细粒度划分
  logging.level.com.example=debug
  #时间；日志级别；类；方法；行（行不能使用圆括号）
  logging.pattern.console=%d{yyyy-MM-dd:mm:ss} %-5level %C.%M[%line] - %msg%n

  

  