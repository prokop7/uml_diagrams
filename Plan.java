public class Plan {
	Plan() {
		this.schedules = new Schedule[7];
	}
	public void SetDaySchedule(Schedule schedule, int n) {
		schedules[n] = schedule;
	}
	public Schedule GetDayMenu(int day) {
		return schedules[day];
	}
	Schedule[] schedules;
}