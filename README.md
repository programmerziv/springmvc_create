# springmvc_create
### 三种springmvc的创建方式，只是希望通过idea创建一个mvc项目  
具体步骤如下：  
1.先是创建的时候搞一个maven的web框架  
2.然后将项目中的java文件右键变为Sources Root，同时新建一个文件夹resources，用于放application.xml文件，同时把此文件转换为Resources Root  
3.springMVC的controller三种实现方式分别是：一、实现Controller接口；二、实现HttpRequestHandler接口；三、在类上加@Controller注解  
4.前两者都要重写handleRequest方法，一是有返回值ModelAndView，二没有，并且，这两者都需要自己配置bean标签  
5.注解不需要自己配置bean标签，但是需要配置注解扫描的包标签：context:component-scan（注意：有时候你配置文件的头部可能并没有，你需要手动添加）否则注解不生效    
6.最后你需要个tomcat容器，此时你可以通过<plugin>插件的形式将tomcat嵌入，然后在idea右侧栏有maven->plugins->tomcat7->tomcat7：run，这样项目就可以跑起来啦！！！  
