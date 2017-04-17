public class Algorithm extends Generator {

	/*
	* There should be some parameters which characterizes the algorithm
	*/
	public Algorithm(List<Object> params) {
		this.params = params;
	}

	@override
	public void SetParams(List<Object> params) {
		this.params = params;
	}

	@override
	public void SetRecipes(List<Recipe> recipes) {
		this.allRecipes = recipes;
	}

	@override
	public Schedule Generate(PlanConfiguration config) {
		Recipe[] recipes = new Recipe[3];
		for (int i = 0; i < 3; i++) {
			for (Recipe r : allRecipes) {
				if (CheckSatisfying(config, r, i))
					recipes[i] = r;
			}
		}
		return new Schedule(recipes[0], recipes[1], recipes[2]);
	}

	/*
	* Type: 0 - breakfast
	*		1 - lunch
	*		2 - dinner
	*/
	public Boolean CheckSatisfying(PlanConfiguration config, Recipe recipe, int type) {
		// TODO magic for validation recipes
	} 
}