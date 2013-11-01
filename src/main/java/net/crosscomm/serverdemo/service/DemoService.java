package net.crosscomm.serverdemo.service;

import net.crosscomm.serverdemo.tasks.NotifyUsersDeferredTask;
import net.crosscomm.serverdemo.tasks.UpdateSideEffectDataDeferredTask;

import org.springframework.stereotype.Component;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

@Component
public class DemoService {
	public void updateCriticalData() throws Exception{
		Thread.sleep(100);
	}
	
	public void updateSideEffectData() throws Exception{
		Thread.sleep(200);
	}
	
	public void notifyUsersOfUpdate() throws Exception{
		Thread.sleep(200);
	}
	
	/*
	 * This demonstration uses DeferredTasks to simplify code.  Production usages should utilize web hooks for
	 * TaskQueues to allow multiple versions of the application to access the same queue entries 
	 */
	public void sendToWorkers() {
		//Send to side effect data queue
		Queue sideEffectDataQueue = QueueFactory.getQueue("sideEffectDataQueue");
		sideEffectDataQueue.add(TaskOptions.Builder.withPayload(new UpdateSideEffectDataDeferredTask()));
		
		//Send to notify users queue
		Queue notifyUsersQueue = QueueFactory.getQueue("notifyUsersQueue");
		notifyUsersQueue.add(TaskOptions.Builder.withPayload(new NotifyUsersDeferredTask()));
	}
}
