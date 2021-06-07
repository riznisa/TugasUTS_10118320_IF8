package com.latihan.a10118320;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class CustomCursorAdapter extends CursorAdapter {

    private LayoutInflater layoutInflater;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public CustomCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View v = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        MyHolder holder = new MyHolder();
        holder.ListID = (TextView)v.findViewById(R.id.listID);
        holder.ListTitle = (TextView)v.findViewById(R.id.listTitle);
        holder.ListKategori = (TextView)v.findViewById(R.id.listKategori);
        holder.ListIsi = (TextView)v.findViewById(R.id.listIsi);
        holder.ListCreated = (TextView)v.findViewById(R.id.listCreated);
        v.setTag(holder);
        return v;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        MyHolder holder =(MyHolder)view.getTag();

        holder.ListID.setText(cursor.getString(cursor.getColumnIndex(DBHelper.row_id)));
        holder.ListTitle.setText(cursor.getString(cursor.getColumnIndex(DBHelper.row_title)));
        holder.ListKategori.setText(cursor.getString(cursor.getColumnIndex(DBHelper.row_kategori)));
        holder.ListIsi.setText(cursor.getString(cursor.getColumnIndex(DBHelper.row_isi)));
        holder.ListCreated.setText(cursor.getString(cursor.getColumnIndex(DBHelper.row_created)));
    }

    class MyHolder {
        TextView ListID;
        TextView ListTitle;
        TextView ListKategori;
        TextView ListIsi;
        TextView ListCreated;

    }
}
