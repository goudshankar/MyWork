package com.spring.propertyeditor;

import com.spring.model.SkillsVo;
import java.beans.PropertyEditorSupport;

public class SkillsEditor
  extends PropertyEditorSupport
{
  public void setAsText(String Id)
  {
    SkillsVo sv;

    switch (Integer.parseInt(Id))
    {
    case 1: 
      sv = new SkillsVo(Integer.valueOf(1), "Java"); break;
    case 2: 
      sv = new SkillsVo(Integer.valueOf(2), "C"); break;
    case 3: 
      sv = new SkillsVo(Integer.valueOf(3), ".Net"); break;
    case 4: 
      sv = new SkillsVo(Integer.valueOf(4), "SAP"); break;
    default: 
      sv = null;
    }
    setValue(sv);
  }
}
