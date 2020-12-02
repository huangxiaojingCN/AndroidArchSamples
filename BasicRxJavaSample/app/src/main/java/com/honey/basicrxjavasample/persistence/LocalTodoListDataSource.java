package com.honey.basicrxjavasample.persistence;

import com.honey.basicrxjavasample.ItemDataSoure;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public class LocalTodoListDataSource implements ItemDataSoure {

    private final ItemDao mItemDao;

    public LocalTodoListDataSource(ItemDao itemDao) {
        this.mItemDao = itemDao;
    }

    @Override
    public Flowable<List<Item>> getItems() {
        return mItemDao.getItems();
    }

    @Override
    public Completable insertOrUpdateUser(Item item) {
        return mItemDao.insertItem(item);
    }

    @Override
    public void deleteAllUsers() {
        mItemDao.deleteAllUsers();
    }
}
