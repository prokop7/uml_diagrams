public abstract class PlannerBase {
	protected Plan plan;
	protected Generator algorithm;

	abstract void Generate(PlanConfiguration config);
	abstract void SetAlgorithm(Generator a);
	abstract void SetRecipes(List<Recipe> recipes);

	public Plan GetPlan() {
		return plan;
	}
}