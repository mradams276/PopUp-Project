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
		
		answer = display.collectResponse("Whats going on?");
		display.displayMessage(answer + " is what you said");
		}
	}
}