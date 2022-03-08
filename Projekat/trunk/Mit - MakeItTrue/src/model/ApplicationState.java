/***********************************************************************
 * Module:  ApplicationState.java
 * Author:  G1
 ***********************************************************************/

package model;
/**Interfejs za definisanje metoda koje se pona�ajau razli�ito u odnosu na stanje u kom se nalazi aplikacija.**/
public interface ApplicationState {
   /**Metoda za kreiranje projekta na odabranom mjestu na ra�unaru.
    *  @param context - Objekat nad kojim se izvr�ava metoda.
    *  @param url � Putanja da odabranog mjesta na ra�unaru. */
   void createProject(ApplicationModel context, String url);
   /**Metoda za otvaranje postoje�eg projekta.
    *  @param context - Objekat nad kojim se izvr�ava metoda.
    *  @param url � Putanja da odabranog mjesta na ra�unaru. */
   void openProject(ApplicationModel context, String url);
   /**Metoda za zatvaranje izabranog projekta projekta.
    *  @param context - Objekat nad kojim se izvr�ava metoda. */
   void closeProject(ApplicationModel context);
   /**Metoda za brisanje izabranog projekta.
    *  @param context - Objekat nad kojim se izvr�ava metoda.*/
   void deleteProject(ApplicationModel context);
   /**Metoda za �uvanje izabranog projekta.
    *  @param context  - Objekat nad kojim se izvr�ava metoda. 
 * @param project - Projekat koji se �uva. */
   void saveProject(ApplicationModel context, Project project);
   /** Metoda za �uvanje izmjena izabranog projekta projekta 
    * @param context - Objekat nad kojim se izvr�ava metoda.*/
   void saveAsProject(ApplicationModel context);
   /** Metoda za preimenovanje izabranog projekta 
    *  @param context - Objekat nad kojim se izvr�ava metoda.*/
   void renameProject(ApplicationModel context);
}