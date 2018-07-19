package templatePattern;

public abstract class Team {

	
		public final void doJob() {
			work();
		    training();
			project();
		}

		public abstract void work();

		public abstract void training();

		public void project() {
			System.out.println("Project requires team work");
		}

		

	}


