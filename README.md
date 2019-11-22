# Springbootzabbix_wujianqinjian

#### 2019/11/12 项目记录

**完成各个电脑的github同步**

- 问题： 其中一台电脑无法clone项目   
- 查找问题过程：
    1. 检查是否可以clone其他任意项目，结果：No
    2. 检查秘钥文件，秘钥和github上公钥一致
    3. 检查网络问题，开启代理和关闭代理效果一致，均无法clone，可能与网络无关
    4. 使用gitbash进行clone，速度仅为几KB每秒，排除idea设置可能
    5. 修改hosts，刷新DNS（无效）
    6. 通过QQ群和微信群征询意见，获取以下几张方案：
        - 设置git使用代理（无效）
        - 在gitbash中使用git config --global sendpack.sideband false；使用后下载速度提升，
          但过一会就会减速（无效）
        - **将项目转到gitee（码云）上，从码云上clone下来，然后在idea中修改远程推送地址！(有效)**
        - idea底部控制台选择“terminal，
          执行 git remote set-url origin https://github.com/wujianqinjian/Springbootzabbix_wujianqinjian。
