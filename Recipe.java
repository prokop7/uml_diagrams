public class Recipe {
	Recipe(String description, List<Product> products, DeltaTime cTime) {
		this.description = description;
		this.products = products;
		this.cookingTime = cTime;
	}

	List<Product> products;
	String description;
	DeltaTime cookingTime;

	int GetCalories() {
		sum = 0;
		products.foreach(v => sum += v.calories);
		return sum;
	}

	int GetProtein() {
		sum = 0;
		products.foreach(v => sum += v.protein);
		return sum;
	}

	int GetFat() {
		sum = 0;
		products.foreach(v => sum += v.fat);
		return sum;
	}
	
	int GetCarbs() {
		sum = 0;
		products.foreach(v => sum += v.carbs);
		return sum;
	}
}