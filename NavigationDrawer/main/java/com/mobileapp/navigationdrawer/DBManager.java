//package com.mobileapp.navigationdrawer;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import androidx.annotation.Nullable;
////database create krne k lie SQLiteOpenHelper use krte hain iske do abstract method hote hain onCreate and onUpdate or ek constructor hota hai
//
//public class DBManager extends SQLiteOpenHelper {
////    static is used to
////    final keyword islie used krte hain k isse baad me rewrite na krskein
//
//    private static final String DATABASE_NAME = "NotesDB";
//    private static final int DATABASE_VERSION = 1;
//    private static final String TABLE_NAMES = "notesTb";
//    private static final String ID = "Id";
//    private static final String TITLE = "Title";
//    private static final String NOTES = "Notes";
//
////    SQLitte is a serverless database stored data in local storage
////    serverless k lie hme internet ki need nhi hoti hai
//    //    context means reference
//    public DBManager(@Nullable Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
////    contructer are used to initialize the class variables
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        // CREATE TABE notesTb (Id INTEGER PRIMARY AUTOINCREMENT, Title TEXT, Notes TEXT);
//        db.execSQL("CREATE TABLE " + TABLE_NAMES +
//                "("+ ID +"INTEGER PRIMARY KEY AUTOINCREMENT," +TITLE + "TEXT," + NOTES + "TEXT" +")");
//
////        SQLiteDatabase database = this.getReadableDatabase(); // isme sirf select query use krskte hain
////        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase(); // isme update, insert, delete use krte hain
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAMES);
//        onCreate(db);
//    }
//
//    public boolean addNotes(String title, String notes){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
////        isme hm colum name deinge, or value isme parameter se aaegi
//        values.put(TITLE, title);
//        values.put(NOTES, notes);
//        long result = db.insert(TABLE_NAMES, null, values);
//
////        if (result == -1) {
////            return false;
////        } else{
////            return  true;
////        }
////        or we can write it is as like this
//        return result > 0;
//    }
//
//    // Method to get all data
//    public Cursor getData() {
//        SQLiteDatabase db = this.getReadableDatabase();
//        return db.rawQuery("SELECT * FROM " + TABLE_NAMES, null);
//    }
//}
