/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.oscon2014.schedulebuilder.views;
import com.codename1.ui.*;
import com.codename1.components.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;
class ScheduleListTpl {
private Container rootContainer;
private Resources resources;
public Container getRoot(){ if (rootContainer==null){ 
        try {rootContainer=buildUI();} catch (Exception ex){ex.printStackTrace();throw new RuntimeException(ex.getMessage());}} return rootContainer;}
private java.util.Map<String,Component> _nameIndex=new java.util.HashMap<String,Component>();
public Component get(String name){ getRoot(); return _nameIndex.get(name);}
public ScheduleListTpl(java.util.Map context){
for (Object o : context.values()){ if (o instanceof Resources) resources=(Resources)o;}
}
private Container buildUI() throws Exception {
Container root = new Container();
BorderLayout rootLayout = new BorderLayout();
root.setLayout(rootLayout);
Tabs node1 = new Tabs();
node1.setName("dateTabs");
_nameIndex.put("dateTabs", node1);
if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()){
root.addComponent(BorderLayout.CENTER, node1);
}
return root;
}
public Tabs getDateTabs(){
      return (Tabs)get("dateTabs");
      }
}