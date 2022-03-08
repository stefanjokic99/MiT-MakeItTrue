/***********************************************************************
 * Module:  Observer.java
 * Author:  G1
 ***********************************************************************/

package observer;
/**Interfejs koji defini�e metode potrebne za primjenu posmatra�a**/
public interface Observer {
	/**Metoda za a�uriranje subjekta
	 * @param subject - subjekat koji se a�urira
	 * **/
   void update(Subject subject);

}