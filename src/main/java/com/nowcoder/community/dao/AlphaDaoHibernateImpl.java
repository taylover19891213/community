package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("Hibernate") //声明bean的名称，也可以引用默认名称
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
