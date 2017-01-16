package com.nguyenthanhnam.oop;

//Class: animals (type, name, color, going, food, runining(), eating() ) 
//Class: persion (type, name, color, going, food, runining(), eating() ) 
//Class: child (type, name, color, going, food, runining(), eating() )
public abstract class Roots {
	protected String type;
	protected String name;
	protected String color;
	protected String food;

	protected abstract void running();

	protected abstract void eating();
}
