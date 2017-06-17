package com.marktony.zhihudaily.refactor.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.marktony.zhihudaily.refactor.data.DoubanMomentContent;
import com.marktony.zhihudaily.refactor.data.DoubanMomentPosts;
import com.marktony.zhihudaily.refactor.data.GuokrHandpickContentResult;
import com.marktony.zhihudaily.refactor.data.GuokrHandpickNewsResult;
import com.marktony.zhihudaily.refactor.data.ZhihuDailyContent;
import com.marktony.zhihudaily.refactor.data.ZhihuDailyNewsQuestion;
import com.marktony.zhihudaily.refactor.database.dao.DoubanMomentContentDao;
import com.marktony.zhihudaily.refactor.database.dao.DoubanMomentNewsDao;
import com.marktony.zhihudaily.refactor.database.dao.GuokrHandpickContentDao;
import com.marktony.zhihudaily.refactor.database.dao.GuokrHandpickNewsDao;
import com.marktony.zhihudaily.refactor.database.dao.ZhihuDailyContentDao;
import com.marktony.zhihudaily.refactor.database.dao.ZhihuDailyNewsDao;


/**
 * Created by lizhaotailang on 2017/6/15.
 */

@Database(entities = {
        ZhihuDailyNewsQuestion.class,
        DoubanMomentPosts.class,
        GuokrHandpickNewsResult.class,
        ZhihuDailyContent.class,
        DoubanMomentContent.class,
        GuokrHandpickContentResult.class},
        version = 1)
public abstract class AppDatabase extends RoomDatabase {

    static final String DATABASE_NAME = "paper-plane-db";

    public abstract ZhihuDailyNewsDao zhihuDailyNewsDao();

    public abstract DoubanMomentNewsDao doubanMomentNewsDao();

    public abstract GuokrHandpickNewsDao guokrHandpickNewsDao();

    public abstract ZhihuDailyContentDao zhihuDailyContentDao();

    public abstract DoubanMomentContentDao doubanMomentContentDao();

    public abstract GuokrHandpickContentDao guokrHandpickContentDao();

}
