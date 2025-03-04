package edu.mu.council;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance;
	
	private MiddleEarthCouncil() {}
	
	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
}