package com.rouleau.purduewalkingdirections;
//dr0uleau test
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnSearch = (Button)findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this, Search.class);
				startActivity(intent);
			}
		});
        
        Button btnList = (Button)findViewById(R.id.btnList);
        btnList.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this, List.class);
				startActivity(intent);
			}
		});
        
        Button btnFavorites = (Button)findViewById(R.id.btnFavorites);
        btnFavorites.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this, Favorites.class);
				startActivity(intent);
				
			}
		});
    }
}