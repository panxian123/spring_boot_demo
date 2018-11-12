package com.itheima.boot.pojo;

/**
 * @author NQ
 * @create 2018-11-09 10:33
 */
public class User {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
