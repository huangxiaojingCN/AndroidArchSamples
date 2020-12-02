package com.honey.basicrxjavasample.persistence;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.PrimaryKey;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

@Dao
public interface ItemDao {
    /**
     * 获取数据中的所有代办事项
     */
    @Query("SELECT * FROM Items")
    Flowable<List<Item>> getItems();

    /**
     * 插入一项待办事项到数据库
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertItem(Item item);

    /**
     * 删除数据中所有的事项
     */
    @Query("DELETE FROM Items")
    void deleteAllUsers();
}
