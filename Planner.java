public class Planner extends PlannerBase {
	public Planner(Generator algorithm) {
		this.plan = new Plan();
		this.algorithm = algorithm;
	}

	@override
	public void Generate(PlanConfiguration config) {
		for (int i = 0; i < 7; i++) {
			var schedule = algorithm.Generate(config);
			this.plan.SetDaySchedule(schedule, i);
		}
	}

	@override
	public void SetAlgorithm(Generator a) {
		if (a != null)
			this.algorithm = a;
	}

	@override
	public void SetRecipes(List<Recipe> recipes) {
		this.algorithm.SetRecipes(recipes);
	}

}