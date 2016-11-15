package com.example.vicky.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.vicky.myapp.R;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class TableView2 extends LinearLayout implements View.OnClickListener{

    private ImageView btn1, btn2, btn3;
    private ImageView btn4;

//    private ArrayList<String> urlList=new ArrayList<>();

    private OnItemClickListener onItemClickListener;


    public TableView2(Context context) {
        this(context,null,0);
    }

    public TableView2(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TableView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_table_layout, this);
        initView(context);
    }

//    public void setUrlList(ArrayList<String> urlList) {
//        this.urlList = urlList;
//    }

    public void  setDrawList(Context context , ArrayList<Integer> drawList){
        btn1.setBackgroundResource(R.drawable.gushi1);
        btn2.setBackgroundResource(R.drawable.gushi2);
        btn3.setBackgroundResource(R.drawable.gushi3);
        btn4.setBackgroundResource(R.drawable.gushi4);

    }

    private void initView(Context context) {
        btn1=(ImageView)findViewById(R.id.imageButtont1);
        btn2=(ImageView)findViewById(R.id.imageButtont2);
        btn3=(ImageView)findViewById(R.id.imageButtont3);
        btn4=(ImageView)findViewById(R.id.imageButtont4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.imageButtont1){
            onItemClickListener.onItemClick(0);
        }else if(view.getId()==R.id.imageButtont2){
            onItemClickListener.onItemClick(1);
        }else if(view.getId()==R.id.imageButton3){
            onItemClickListener.onItemClick(2);
        }else if(view.getId()==R.id.imageButtont4){
            onItemClickListener.onItemClick(3);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int num);
    }

    public void setOnItemClick(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }
}
