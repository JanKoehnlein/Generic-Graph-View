import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MrsGrantsSecretCompartments {
	
	public static void main(String[] args) {
		new MrsGrantsSecretCompartments().run();
	}
	
	protected void doUnlockPanel() {
		System.out.println("Executing command unlockPanel (PNUL)");
	}
	protected void doLockPanel() {
		System.out.println("Executing command lockPanel (PNLK)");
	}
	protected void doLockDoor() {
		System.out.println("Executing command lockDoor (D1LK)");
	}
	protected void doUnlockDoor() {
		System.out.println("Executing command unlockDoor (D1UL)");
	}
	
	protected void run() {
		boolean executeActions = true;
		String currentState = "idle";
		String lastEvent = null;
		while (true) {
			if (currentState.equals("idle")) {
				if (executeActions) {
					doUnlockDoor();
					doLockPanel();
					executeActions = false;
				}
				System.out.println("Your are now in state 'idle'. Possible events are [doorClosed].");
				lastEvent = receiveEvent();
				if ("doorClosed".equals(lastEvent)) {
					currentState = "active";
					executeActions = true;
				}
			}
			if (currentState.equals("active")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'active'. Possible events are [drawOpened, lightOn].");
				lastEvent = receiveEvent();
				if ("drawOpened".equals(lastEvent)) {
					currentState = "waitingForLight";
					executeActions = true;
				}
				if ("lightOn".equals(lastEvent)) {
					currentState = "waitingForDraw";
					executeActions = true;
				}
			}
			if (currentState.equals("waitingForLight")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'waitingForLight'. Possible events are [lightOn].");
				lastEvent = receiveEvent();
				if ("lightOn".equals(lastEvent)) {
					currentState = "unlockedPanel";
					executeActions = true;
				}
			}
			if (currentState.equals("waitingForDraw")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'waitingForDraw'. Possible events are [drawOpened].");
				lastEvent = receiveEvent();
				if ("drawOpened".equals(lastEvent)) {
					currentState = "unlockedPanel";
					executeActions = true;
				}
			}
			if (currentState.equals("unlockedPanel")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'unlockedPanel'. Possible events are [].");
				lastEvent = receiveEvent();
			}
			if (currentState.equals("foo")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'foo'. Possible events are [].");
				lastEvent = receiveEvent();
			}
			if ("doorClosed".equals(lastEvent)) {
				System.out.println("Resetting state machine.");
				currentState = "idle";
				executeActions = true;
			}
			
		}
	}
	
	private String receiveEvent() {
		System.out.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println("Problem reading input");
			return "";
		}
	}
}
