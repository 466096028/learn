package cn.huanzi.qch.springbootencrpt;

/**
 * @program: springBoot-master
 * @description:
 * @author: jiangtaohou
 * @create: 2023-10-16 11:38
 **/
public class User {
    private String name;
    private String password;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
