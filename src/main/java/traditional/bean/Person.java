package traditional.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Component
//confiugurationProperties(prefix="person")
//仅仅开启了自动配置，如果想读取到propertySource中的配置文件，
//必须ConfigurationProperties和PropertySource同时声明
@ConfigurationProperties(prefix="person")
@PropertySource("classpath:config/person.properties")
@Validated
public class Person implements Serializable {
    @Getter @Setter private String lastName;
    @Getter @Setter private Integer age;
    @Getter @Setter private Boolean boss;
    @Getter @Setter private Date birth;

    @Getter @Setter private Map<String,String> maps;
    @Getter @Setter private List<String> lists;
    @Getter @Setter private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

}



















/*
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
*/
