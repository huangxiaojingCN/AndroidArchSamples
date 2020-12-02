package com.honey.basicrxjavasample.persistence;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity(tableName = "Items")
public class Item {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "itemId")
    private String mItemId;

    @NonNull
    @ColumnInfo(name = "content")
    private String mContent;

    @Ignore
    public Item(String content) {
        this.mItemId = UUID.randomUUID().toString();
        this.mContent = content;
    }

    public Item(String id, String content) {
        this.mItemId = id;
        this.mContent = content;
    }

    public String getmItemId() {
        return mItemId;
    }
    public String getmContent() {
        return mContent;
    }
}
