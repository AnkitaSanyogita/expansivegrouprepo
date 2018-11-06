package com.expansivegroup.box.selectbox;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.jbpm.formModeler.core.config.SelectValuesProvider;
import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.Field;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class SelectDataProvider implements SelectValuesProvider {

    static final long serialVersionUID = 1L;

    public SelectDataProvider() {
    }
    
    public String getIdentifier()
  {
    return "InvestmentCategoryProvider";
  }
  
  public Map<String, String> getSelectOptions(Field field, String value, FormRenderContext formRenderContext, Locale locale)
  {
    HashMap<String, String> options = new HashMap();
    options.put("1", "Test1");  
     options.put("2", "Test2");  
 
    return options;
  }

}