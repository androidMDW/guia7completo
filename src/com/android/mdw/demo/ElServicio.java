package com.android.mdw.demo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class ElServicio extends Service {

	private MediaPlayer player;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		Toast.makeText(this, "Servicio Creado", Toast.LENGTH_LONG).show();		
		player = MediaPlayer.create(this, R.raw.water_droplet);
		player.setLooping(true);
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "Servicio Detenido", Toast.LENGTH_LONG).show();
		player.stop();
	}
	
	@Override
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "Servicio Iniciado", Toast.LENGTH_LONG).show();
		player.start();
	}	

}
