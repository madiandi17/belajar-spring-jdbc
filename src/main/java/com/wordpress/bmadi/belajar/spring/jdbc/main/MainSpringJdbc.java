package com.wordpress.bmadi.belajar.spring.jdbc.main;

import com.wordpress.bmadi.belajar.spring.jdbc.domain.PersonDao;
import com.wordpress.bmadi.belajar.spring.jdbc.model.Person;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringJdbc {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:jdbc.xml");

        PersonDao personDao = (PersonDao) ctx.getBean("personDao");

        Person p = new Person();
        p.setNama("Madi Andi");
        p.setTanggaLahir(new Date());

        personDao.simpan(p);

    }

}
