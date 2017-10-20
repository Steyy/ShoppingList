package edu.upc.eseiaat.pma.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {

    private ArrayList <String> itemList;
    private ArrayAdapter<String> adapter;

    private ListView list;
    private Button btn_add;
    private EditText edit_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
//3cosas que necesitamos
        list = (ListView) findViewById(R.id.list);
        btn_add = (Button) findViewById(R.id.btn_add);
        edit_item = (EditText) findViewById(R.id.edit_item);

        itemList = new ArrayList<>();
        itemList.add("Patatas");
        itemList.add("Papel WC");
        itemList.add("Zanahorias");
        itemList.add("Copas Danone");

        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                itemList
        );
        //listener de cuando clican el botón
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem();
            }
        });

        list.setAdapter(adapter);

    }

    private void addItem() {
        String item_text = edit_item.getText().toString();
        if (item_text.isEmpty()) {
            itemList.add(item_text);
            adapter.notifyDataSetChanged(); //Añadir item a la lista

        }

    }
}
