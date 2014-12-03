/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.oscon2014.schedulebuilder.views;

import com.codename1.ui.*;
import com.codename1.components.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;

class SideMenuTpl {

    private Container rootContainer;
    private Resources resources;

    public Container getRoot() {
        if (rootContainer == null) {
            try {
                rootContainer = buildUI();
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex.getMessage());
            }
        }
        return rootContainer;
    }
    private java.util.Map<String, Component> _nameIndex = new java.util.HashMap<String, Component>();

    public Component get(String name) {
        getRoot();
        return _nameIndex.get(name);
    }

    public SideMenuTpl(java.util.Map context) {
        for (Object o : context.values()) {
            if (o instanceof Resources) {
                resources = (Resources) o;
            }
        }
    }

    private Container buildUI() throws Exception {
        Container root = new Container();
        BorderLayout rootLayout = new BorderLayout();
        root.setLayout(rootLayout);
        Container node1 = new Container();
        FlowLayout node1Layout = new FlowLayout();
        node1.setLayout(node1Layout);
        Label node2 = new Label();
        node2.setUIID("CommmandTitle");
        node2.setText("Categories");
        if (node2.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node2.getParent()) {
            node1.addComponent(node2);
        }
        if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()) {
            root.addComponent(BorderLayout.NORTH, node1);
        }
        List node3 = new List();
        if (node3.getClientProperty("__CN1ML_NO_ADD__") == null && root != node3.getParent()) {
            root.addComponent(BorderLayout.CENTER, node3);
        }
        return root;
    }
}