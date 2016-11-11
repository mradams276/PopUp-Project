package popup.controller;

import popup.view.PopupViewer;

public class PopupController
{
	
	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && !equals(""))
		{
		display.displayMessage("Hey BRUH");
		
		answer = display.collectResponse("I hate TORBJORN plz nerf!"
				+ "?");
		display.displayMessage(answer + " I really don't care what you say I play overewatch EVUREEY DAY");
		}
	}
}