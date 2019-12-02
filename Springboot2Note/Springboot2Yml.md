Spring-boot(二)通过微信熟悉熟悉Spring-boot yml配置文件


##### 前言：Spring-boot的yml配置文件，这里就不在借助人、狗介绍了，试试套下微信!
##### 创建yml文件
- **值得注意的是下图中有三种命名方法，前两种是对的，且第二种必须是横线而不是下划线！**
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/Springboot2Yml/1.png)
1. **yml文件的基本语法：由键值对和空格组成**
- 值得注意的是：作为yml的固定格式，如wxmessage、contacts这样的键后面，都需要加一个空格
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/Springboot2Yml/2.png)
```yml
weixin:
        wxmessage: message
        contacts: friends
        discover: find_list
        me: owner_message
```


2. **yml的Map写法：一般情况下好友列表都会有ID,对应的昵称，头像地址，我们这里拿不到id，
 则可以将好友列表当做Map**
 - **这里需要注意的是再使用IDEA 编辑配置文件的时候，如果发现配置文件的编辑项显示异常，
  比如：contacts :{image_qiankui: "百人钱坤",** image_qianmo: "百人阡陌"*}，
  **那么很有可能是配置文件的类型和实际映射的实体类型不一致，即：在java文件里定义了
  一个属性：private Contacts contacts，实体却定义成Map类型，就会出错或者值为null**
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/Springboot2Yml/3.png)
```yml
weixin:
        contacts :{image_qiankui: "百人钱坤",image_qianmo: "百人阡陌",}
```


3. **yml的 数组写法：微信的发现表面看很明显是一个List**
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/Springboot2Yml/4.png)
```yml
  #  第一种数组写法
  find-list: [moments,Scan QR Code,Shake]
  # 第二种数组写法
  find-list:
    - moments
    - Scan QR Code
    - Shake
```

4. **yml的对象写法：“我”模块中包含着用户的昵称、头像、支付、相册等，可以当做一个对象来处理。**
![](https://github.com/wujianqinjian/ImageRep/blob/master/Springboot2/Springboot2Yml/5.png)
```yml
me:
    wxNickName: .
    wxId: miao90***
    wxPay: payAdress
```
5.  **配置文件相关的两个注解**：
	//将对象注入到容器内
	@Component
	//标注在类名上表示该类对应配置文件的“weixin”
    @ConfigurationProperties(prefix = "weixin")


#### 总结： 以上四种yml的常用写法，除第一种很少能用上之外，其他的三种看似简单，但经常会因为空格层级关系不明确、实体类型映射不匹配等问题导致项目运行不成功！
#### 附：测试相关代码
```java
package com.wujianqinjian.springboot_note.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "weixin")
public class Weixin {
    private List<String> message;
    private Map<String,String> contacts;
    private List<String> findList;
    private Me me;

    @Override
    public String toString() {
        return "Weixin{" +
                "message=" + message +
                ", contacts=" + contacts +
                ", findList=" + findList +
                ", me=" + me +
                '}';
    }

    public List<String> getMessage() {
        return message;
    }
    public void setMessage(List<String> message) {
        this.message = message;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getFindList() {
        return findList;
    }

    public void setFindList(List<String> findList) {
        this.findList = findList;
    }

    public Me getMe() {
        return me;
    }

    public void setMe(Me me) {
        this.me = me;
    }
}

```

```java
package com.wujianqinjian.springboot_note.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "contacts")
public class Contacts {
    private String imageUrl;
    private String nickName;

    @Override
    public String toString() {
        return "Contacts{" +
                "imageUrl='" + imageUrl + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

```

```java
package com.wujianqinjian.springboot_note.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "me")
public class Me {
    private String wxNickName;
    private String wxId;
    private String wxPay;
    private String wxCollect;
    private String wxPhoto;
    private String wxCards;
    private String wxExpression;

    @Override
    public String toString() {
        return "Me{" +
                "wxNickName='" + wxNickName + '\'' +
                ", wxId='" + wxId + '\'' +
                ", wxPay='" + wxPay + '\'' +
                ", wxCollect='" + wxCollect + '\'' +
                ", wxPhoto='" + wxPhoto + '\'' +
                ", wxCards='" + wxCards + '\'' +
                ", wxExpression='" + wxExpression + '\'' +
                '}';
    }

    public String getWxNickName() {
        return wxNickName;
    }

    public void setWxNickName(String wxNickName) {
        this.wxNickName = wxNickName;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getWxPay() {
        return wxPay;
    }

    public void setWxPay(String wxPay) {
        this.wxPay = wxPay;
    }

    public String getWxCollect() {
        return wxCollect;
    }

    public void setWxCollect(String wxCollect) {
        this.wxCollect = wxCollect;
    }

    public String getWxPhoto() {
        return wxPhoto;
    }

    public void setWxPhoto(String wxPhoto) {
        this.wxPhoto = wxPhoto;
    }

    public String getWxCards() {
        return wxCards;
    }

    public void setWxCards(String wxCards) {
        this.wxCards = wxCards;
    }

    public String getWxExpression() {
        return wxExpression;
    }

    public void setWxExpression(String wxExpression) {
        this.wxExpression = wxExpression;
    }
}

```
