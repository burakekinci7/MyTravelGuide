package com.flashex.mytravelguide.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.flashex.mytravelguide.model.Place;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface PlaceDao {
    //rxJava -> Completable Flowable

    @Query("SELECT * FROM Place")
    Flowable<List<Place>>  getAll();

    /* variable sql
    @Query("SELECT * FROM Place WHERE :value")
    List<Place> getAll(String value);
     */

    @Insert
    Completable insertsss(Place place);

    @Delete
    Completable delete(Place place);


}
