package com.fox.nest_recycler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.fox.nest_recycler.adapters.ParentItemAdapter;
import com.fox.nest_recycler.models.ChildItem;
import com.fox.nest_recycler.models.ParentItem;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView ParentRecyclerViewItem = findViewById(R.id.parent_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        ParentItemAdapter parentItemAdapter = new ParentItemAdapter(ParentItemList());

        ParentRecyclerViewItem.setAdapter(parentItemAdapter);
        ParentRecyclerViewItem.setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList() {
        List<ParentItem> itemList = new ArrayList<>();
        for(int i = 1; i <=10 ; i++) {
            ParentItem item = new ParentItem("Title " + i, ChildItemList());
            itemList.add(item);
        }
        return itemList;
    }

    private List<ChildItem> ChildItemList() {
        List<ChildItem> ChildItemList = new ArrayList<>();
        for(int i = 1; i <=10 ; i++) {
            ChildItemList.add(new ChildItem("Card " + i));
        }
        return ChildItemList;
    }
}