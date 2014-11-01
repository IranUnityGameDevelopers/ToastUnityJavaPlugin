package ir.unity3d.toastunityplugin;

import com.unity3d.player.UnityPlayer;

public class ToastHandler {

	public ToastHandler()
	{
		
	}
	
	public void Toast(final String message , final Boolean messageType)
	{
		UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
			public void run() {
				if(messageType)
				{
					android.widget.Toast.makeText( UnityPlayer.currentActivity.getApplicationContext(), message,
							android.widget.Toast.LENGTH_LONG).show();			
				}
				else
				{
					android.widget.Toast.makeText( UnityPlayer.currentActivity.getApplicationContext(), message,
							android.widget.Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

}
