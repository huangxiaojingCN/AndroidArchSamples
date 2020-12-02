package com.honey.basicrxjavasample.persistence;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Item.class}, version = 1)
public abstract class TodoListDatabase extends RoomDatabase {
    private static volatile TodoListDatabase INSTANCE;

    public static final String DB_NAME = "todolist.db";

    private TodoListDatabase() {}

    public static TodoListDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (TodoListDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            TodoListDatabase.class,
                            DB_NAME)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
