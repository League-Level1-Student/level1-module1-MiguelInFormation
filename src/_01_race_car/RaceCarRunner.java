package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar car = new RaceCar("Gmc", 5 );
	
		// 2. Print the RaceCar's position in the race
		System.out.println(car.getPositionInRace());

		// 3. Crash the RaceCar
		car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
car.pit();
		// 5. Help the car move into first place.
car.overtake();

for (int i = 0; i < 6; i++) {
	car.overtake();
}
	}
}
