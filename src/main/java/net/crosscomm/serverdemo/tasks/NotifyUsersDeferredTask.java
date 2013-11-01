package net.crosscomm.serverdemo.tasks;

import com.google.appengine.api.taskqueue.DeferredTask;

public class NotifyUsersDeferredTask implements DeferredTask {

	private static final long serialVersionUID = 2268064776671132875L;

	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Users notified");
	}

}
