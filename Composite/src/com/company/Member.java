package com.company;

/**
 * Created by huang on 2023/3/22.
 */
public class Member extends AbstractMember {
 public Member(String name) {
  this.name = name;
 }

 @Override
 public void shareTo(AbstractMember target) {
  System.out.println(name + " shareTo " + target.name);
 }
}
