/***********************************************************************
 * Module:  PropertyParserStrategy.java
 * Author:  G1
 ***********************************************************************/

package model;

import java.util.HashMap;
/**Interfejs koji defini�e metode potrebne za parsiranje strategije**/
public interface PropertyParserStrategy {
	/**Metoda za parsiranje strategije.**/
	HashMap<String, String> parse();
}