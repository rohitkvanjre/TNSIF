package com.java.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoFucntionality {
	private static void performaction(String action, Deque<String> actionHistory) {
		System.out.println(action);
		actionHistory.addFirst(action);
	}
	public static void main(String[] args) {
		Deque<String> actionHistory = new ArrayDeque<>();
		
		performaction("Action 1", actionHistory);
		performaction("Action 2", actionHistory);
		performaction("Action 3", actionHistory);
		
		if(!actionHistory.isEmpty())
		{
			String lastAction = actionHistory.removeLast();
			System.out.println("Undo: "+lastAction);
		}
		if(!actionHistory.isEmpty()) {
			String undoneAction = actionHistory.removeLast();
			System.out.println("Redo: "+ undoneAction);
		}
	}
}
