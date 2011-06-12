package com.android.mdw.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    Button btnInicio = (Button) findViewById(R.id.btnInicio);
    Button btnFin = (Button) findViewById(R.id.btnFin);

    btnInicio.setOnClickListener(this);
    btnFin.setOnClickListener(this);
  }

  public void onClick(View src) {
    switch (src.getId()) {
    case R.id.btnInicio:      
      startService(new Intent(this, ElServicio.class));
      break;
    case R.id.btnFin:
      stopService(new Intent(this, ElServicio.class));
      break;
    }
  }
}