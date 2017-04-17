public abstract class Generator {
	protected List<Recipe> allRecipes; 
	protected List<Object> params; 
	abstract Schedule Generate(PlanConfiguration config);
	abstract void SetRecipes(List<Recipe> recipes);
	abstract void SetParams(List<Object> params);
}