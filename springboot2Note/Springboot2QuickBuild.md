#####  通过向导快速创建Spring-boot项目
##### 创建步骤：
1. 选择Spring Initializr
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/springbootOne/1.png?raw=true)
2. 填写组织和模块名
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/springbootOne/2.png?raw=true)
3. 选择对应的模块
   注：这里左侧的模块比较多，玩家可以根据自己的实际需要自由选择，此处暂时选择web
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/springbootOne/3.png?raw=true)
4. 完成
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/springbootOne/4.png?raw=true)
5. 等待项目自动下载相关依赖完成项目创建
**注:项目类型为maven的话，需要配置阿里云仓库才不会特别慢**
   setting.xml
```yaml
 <mirrors>
    <mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
      <mirrorOf>central</mirrorOf>        
    </mirror>
  </mirrors>
```

6. 编写测试类

```java
package com.wujianqinjian.Controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JianH on 2019/11/15.
 */
@RestController
public class HelloController
{

    @RequestMapping("/hello")
    public String hellofanrui(){
        return "你好，樊瑞";
    }
}

```


7. 启动项目，浏览器访问127.0.0.1:8080
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/springbootOne/5.png?raw=true)
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/springbootOne/6.png?raw=true)
