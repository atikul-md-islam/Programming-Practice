#include <iostream>
using namespace std;

int main()
{
	// Daily water goal in milliliters
	int dailyWaterGoal;
	int morningWater;
	int afternoonWater;
	int eveningWater;
	
	cout << "Enter your daily goal (in ml): ";
	cin >> dailyWaterGoal;
	
	cout << "Enter water drunk in the morning (in ml): ";
	cin >> morningWater;
	
	cout << "Enter water drunk in the afternoon (in ml): ";
	cin >> afternoonWater;
	
	cout << "Enter water drunk in the evening (in ml): ";
	cin >> eveningWater;
	
	// Calculator total water intake
	int totalWaterDrunk = morningWater + afternoonWater + eveningWater;
	
	cout << "\nDaily water goal: " << dailyWaterGoal << "ml" << endl;
	cout << "Total water drunk: " << totalWaterDrunk << "ml" << endl;
	
	if(totalWaterDrunk >= dailyWaterGoal)
	{
		cout << "Great job! You reached your water goal today." << endl;
	}
	else
	{
		int remainingWater = dailyWaterGoal - totalWaterDrunk;
		cout << "You need " << remainingWater << "ml more water today." << endl;
		
	}
	return 0;
}