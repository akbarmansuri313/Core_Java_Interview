package com.rays.oop.deep;

public class Deep implements Cloneable {

	public int balance;
    public Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Deep deep = (Deep) super.clone();

        deep.address = (Address) address.clone();

        return deep;
    }
}