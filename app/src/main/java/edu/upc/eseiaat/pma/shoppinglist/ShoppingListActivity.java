package edu.upc.eseiaat.pma.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class ShoppingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        ListView list = (ListView) findViewById(R.id.list);
        Button btn_add = (Button) findViewById(R.id.btn_add);

    }
}
