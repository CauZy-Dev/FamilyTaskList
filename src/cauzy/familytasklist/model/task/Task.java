package cauzy.familytasklist.model.task;

public abstract class Task {
	
	private static Integer idCounter = 0;
	
	protected String description;
	protected Integer id;
	
	public Task(String description) {
		this.description = description;
		this.id = idCounter;
		idCounter ++;
	}
	
	public Task(String description, Integer id) {
		this.description = description;
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	
}
