# momoka01
个人博客<br>
首先谢谢YuKong菊苣<br>
##1、ssm系统架构
![](http://img.blog.csdn.net/20170413230108170?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveHA1NDExMzAxMjY=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)<br> 
整合步骤<br>
第一步:<br>
　　MyBatis和Spring整合，通过Spring管理mapper接口。<br>
　　使用mapper的扫描器自动扫描mapper接口在Spring中进行注册。<br>
第二步：<br>
　　通过Spring管理Service接口。<br>
　　使用配置方式将Service接口配置在Spring配置文件中。<br>
　　实现事务控制。<br>
第三步：<br>
　　由于SpringMVC是Spring的模块，无需整合这两个。<br>
项目架构: <br>

