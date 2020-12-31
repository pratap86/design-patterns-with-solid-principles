package com.pratap.designpatterns.solid.openclosed;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

	@Override
	double calculateBill() {
		List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
	}

}
