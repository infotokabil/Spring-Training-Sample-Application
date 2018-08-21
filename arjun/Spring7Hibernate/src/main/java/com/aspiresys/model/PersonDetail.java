package com.aspiresys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PersonDetail", catalog = "myschema")
public class PersonDetail {
    @Id
    @GeneratedValue
    private int id;
    private String address;
    private int age;

    @OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Person person;

    public PersonDetail(){}

    public PersonDetail(int id,String address,int age)
    {
        this.id=id;
        this.address=address;
        this.age=age;
    }

    @GenericGenerator(name = "generator", strategy = "foreign")
            @Id
            @GeneratedValue(generator = "generator")
            @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "address", nullable = false, length = 20)
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}