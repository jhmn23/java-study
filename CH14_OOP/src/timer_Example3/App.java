package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class Alert extends TimerTask {
	@Override
	public void run() {
		System.out.println("헬로우");
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("하이!");
	}
}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 1000); //할일:run(), 0초뒤 실행, 반복 1초
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); //할일,딜레이,반복시간,시간타입	
	}
}
