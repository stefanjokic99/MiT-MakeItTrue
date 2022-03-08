package model.commands;

import model.AbstractExecutableCommand;
import model.ApplicationModel;
import model.Diagram;
import model.Project;

/**
 * 
 * Klasa koja realizuje poni�tavanje izvr�enog koraka
 *
 */
public class UndoCommand extends AbstractExecutableCommand {

	public UndoCommand(ApplicationModel applicationModel) {
		super(applicationModel);
	}

	@Override
	public void execute() {
		for(Project project : applicationModel.getActiveProjects()) {
			for(Diagram diagram : project.getDiagrams()) {
				if(diagram.getCurrentState() != null) {
					diagram.undo();
				}
			}
		}
		applicationModel.notifyObservers();
	}

}
