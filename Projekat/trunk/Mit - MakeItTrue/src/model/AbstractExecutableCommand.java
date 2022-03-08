/***********************************************************************
 * Module:  AbstractExecutableCommand.java
 * Author:  G1
 ***********************************************************************/

package model;
/**Apstraktna klasa koje defini�e metode koje su obavezne da se predefini�u u svakoj izvedenoj klasi komande. **/
public abstract class AbstractExecutableCommand implements ExecutableCommand {
   /**Aplikacioni model nad kojim se izvr�ava komanda.**/
	protected ApplicationModel applicationModel;
   
   /** @param applicationModel */
   public AbstractExecutableCommand(ApplicationModel applicationModel) {
	   this.applicationModel = applicationModel;
   }
   /**apstraktna metoda izvr�avanja komande koju predefini�u sve klase komande. **/
   public abstract void execute();
}