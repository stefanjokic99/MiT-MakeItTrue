/***********************************************************************
 * Module:  Project.java
 * Author:  Notebook
 * Purpose: Defines the Class Project
 ***********************************************************************/

package model;

import java.util.Stack;
import java.util.Vector;

public class Project {
	private Vector<Diagram> diagrams;
	private String name;
	private String url;
	private Stack<Memento> undoStack;
	private Stack<Memento> redoStack;

	public Vector<Diagram> getDiagrams() {
		return diagrams;
	}

	public void addDiagram(Diagram newDiagram) {
		diagrams.add(newDiagram);
	}

	public void removeDiagram(Diagram diagram) {
		diagrams.remove(diagram);
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Memento> getUndoStack() {
		if (undoStack == null)
			undoStack = new java.util.Stack<Memento>();
		return undoStack;
	}

	/** @pdGenerated default iterator getter */
	@SuppressWarnings("rawtypes")
	public java.util.Iterator getIteratorUndoStack() {
		if (undoStack == null)
			undoStack = new java.util.Stack<Memento>();
		return undoStack.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newUndoStack
	 */
	@SuppressWarnings("rawtypes")
	public void setUndoStack(java.util.Collection<Memento> newUndoStack) {
		removeAllUndoStack();
		for (java.util.Iterator iter = newUndoStack.iterator(); iter.hasNext();)
			addUndoStack((Memento) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newMemento
	 */
	public void addUndoStack(Memento newMemento) {
		if (newMemento == null)
			return;
		if (this.undoStack == null)
			this.undoStack = new java.util.Stack<Memento>();
		if (!this.undoStack.contains(newMemento))
			this.undoStack.add(newMemento);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldMemento
	 */
	public void removeUndoStack(Memento oldMemento) {
		if (oldMemento == null)
			return;
		if (this.undoStack != null)
			if (this.undoStack.contains(oldMemento))
				this.undoStack.remove(oldMemento);
	}

	/** @pdGenerated default removeAll */
	public void removeAllUndoStack() {
		if (undoStack != null)
			undoStack.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Memento> getRedoStack() {
		if (redoStack == null)
			redoStack = new java.util.Stack<Memento>();
		return redoStack;
	}

	/** @pdGenerated default iterator getter */
	@SuppressWarnings("rawtypes")
	public java.util.Iterator getIteratorRedoStack() {
		if (redoStack == null)
			redoStack = new java.util.Stack<Memento>();
		return redoStack.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newRedoStack
	 */
	@SuppressWarnings("rawtypes")
	public void setRedoStack(java.util.Collection<Memento> newRedoStack) {
		removeAllRedoStack();
		for (java.util.Iterator iter = newRedoStack.iterator(); iter.hasNext();)
			addRedoStack((Memento) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newMemento
	 */
	public void addRedoStack(Memento newMemento) {
		if (newMemento == null)
			return;
		if (this.redoStack == null)
			this.redoStack = new java.util.Stack<Memento>();
		if (!this.redoStack.contains(newMemento))
			this.redoStack.add(newMemento);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldMemento
	 */
	public void removeRedoStack(Memento oldMemento) {
		if (oldMemento == null)
			return;
		if (this.redoStack != null)
			if (this.redoStack.contains(oldMemento))
				this.redoStack.remove(oldMemento);
	}

	/** @pdGenerated default removeAll */
	public void removeAllRedoStack() {
		if (redoStack != null)
			redoStack.clear();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Project(String name, String url) {
		this.name = name;
		this.url = url;
		diagrams = new Vector<Diagram>();
	}

	public void createDiagram() {
		// TODO: implement
	}

	public void openDiagram() {
		// TODO: implement
	}

	public void closeDiagram() {
		// TODO: implement
	}

	public void deleteDiagram() {
		// TODO: implement
	}

	public void saveDiagram() {
		// TODO: implement
	}

	public int renameDiagram() {
		// TODO: implement
		return 0;
	}

}