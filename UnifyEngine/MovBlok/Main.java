package MovBlok;

import MovBlok.Scripts.MovBlokApp;
import UnifyEngine.Window;

public class Main {

	public static void main(String[] args) {
		MovBlokApp app = MovBlokApp.get(1920, 1080, "MovBlok");
		app.run();
	}
}