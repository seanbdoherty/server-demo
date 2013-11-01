package net.crosscomm.serverdemo.tasks;

import com.google.appengine.api.taskqueue.DeferredTask;

public class UpdateSideEffectDataDeferredTask implements DeferredTask {

	private static final long serialVersionUID = -5796857451372248236L;

	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Side effect data updated");
	}

}
