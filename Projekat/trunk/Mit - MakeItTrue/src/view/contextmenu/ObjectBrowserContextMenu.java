/***********************************************************************
 * Module:  ObjectBrowserContextMenu.java
 * Author:  G1
 ***********************************************************************/

package view.contextmenu;

import javax.swing.JLabel;
import javax.swing.JPopupMenu;
/**Klasa koja defini�e konteksni meni za pretra�iva� projekata.**/
public class ObjectBrowserContextMenu extends JPopupMenu {

	private static final long serialVersionUID = 1L;
	private JLabel test;

	public ObjectBrowserContextMenu() {
		test = new JLabel("Nije implementirano");
		add(test);
	}

}
