package com.yxl.design.designComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/21 下午10:01
 */
public class College extends OrganizationComponent{
    List<OrganizationComponent> list = new ArrayList<>();


    public College(String name, String des) {
        super(name, des);

    }


    @Override
    protected void add(OrganizationComponent component) {
        list.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        list.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("--------"+getName()+"--------");
        list.stream().forEach( component -> {
            component.print();
        });
    }
}