package com.spring.model;

import java.io.Serializable;

public class SkillsVo
  implements Serializable
{
  private Integer Id;
  private String name;
  
  public SkillsVo() {}
  
  public SkillsVo(Integer id, String name)
  {
    this.Id = id;
    this.name = name;
  }
  
  public Integer getId()
  {
    return this.Id;
  }
  
  public void setId(Integer id)
  {
    this.Id = id;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String toString()
  {
    return "SkillsVo [Id=" + this.Id + ", name=" + this.name + "]";
  }
}
