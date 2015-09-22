package scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.schedule.classes.CheckClass;

public class MyQuartzJob implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		/*DailySchedule dailySchedule = new DailySchedule();
		dailySchedule.generateDailySchedule();*/
		try{
		CheckClass.getClasses();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
