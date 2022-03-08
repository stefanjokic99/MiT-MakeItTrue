/***********************************************************************
 * Module:  Subject.java
 * Author:  G1
 ***********************************************************************/

package observer;
/**Interfjes koji defini�e sve metode da odredjena klasa postanje subjekat**/
public interface Subject {
   /** Metoda za dodavanje posmatra�a na subjekat
    *  @param observer Posmatra� koji se dodaje 
    **/
   void attach(Observer observer);
   /** Metoda za odvajanje posmatra�a od subjekata
    *  @param observer Posmatra� koji se odvaja 
    **/
   void detach(Observer observer);
   /** Metoda za obavje�tavanje svih posmatra�a koji su nala�eni na subjekat
    *  
    **/
   void notifyObservers();
}