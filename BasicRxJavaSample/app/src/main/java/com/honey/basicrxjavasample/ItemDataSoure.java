package com.honey.basicrxjavasample;

import com.honey.basicrxjavasample.persistence.Item;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public interface ItemDataSoure {

    Flowable<List<Item>> getItems();

    Completable insertOrUpdateUser(Item item);

    void deleteAllUsers();
}
