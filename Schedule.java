public class Schedule {
	Recipe lunch;
	Recipe dinner;
	Recipe breakfast;

	public Schedule(Recipe breakfast, Recipe lunch, Recipe dinner) {
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
	}

	public (int cal, int protein, int fat, int carbs) GetSummary() {
		int protein = lunch.GetProtein() + dinner.GetProtein()  + breakfast.GetProtein();
		int cal = lunch.GetCalories() + dinner.GetCalories()  + breakfast.GetCalories();
		int fat = lunch.GetFat() + dinner.GetFat()  + breakfast.GetFat();
		int carbs = lunch.GetCarbs() + dinner.GetCarbs()  + breakfast.GetCarbs();
		return (cal, protein, fat, carbs);
	}
}