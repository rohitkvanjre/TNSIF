package com.java.queueinterface;

import java.util.PriorityQueue;

class Task implements Comparable<Task>{
	private String name;
	private int priority;
	public Task() {
		super();
	}
	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.getPriority(), this.getPriority());
	}
	
	
	
}
public class TaskScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Task> taskQueue = new PriorityQueue<>();
		taskQueue.add(new Task("Task 1",3));
		taskQueue.add(new Task("Task 2",1));
		taskQueue.add(new Task("Task 3",2));
		taskQueue.add(new Task("Task 1",10));
		taskQueue.add(new Task("Task 2",7));
		taskQueue.add(new Task("Task 3",4));
		
		while(!taskQueue.isEmpty())
		{
			Task task = taskQueue.poll();
			System.out.println(task.getName() + " "+task.getPriority());
		}
	}

}
