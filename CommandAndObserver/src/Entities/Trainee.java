package Entities;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Observable;
import Interfaces.Observer;

public class Trainee implements Observable{
	private List<Observer> observers = new ArrayList<Observer>();
	private String exercise;
	
	@Override
	public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTrainee(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.exercise;
	}

    public void doExercise(String exercise) {
        this.exercise = exercise;
        System.out.println("Trainee is " + this.exercise);
        this.notifyObservers();
    }
}
