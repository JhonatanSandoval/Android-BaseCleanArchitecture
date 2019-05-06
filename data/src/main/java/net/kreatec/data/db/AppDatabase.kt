package net.kreatec.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import net.kreatec.data.DataConstants
import net.kreatec.data.db.dao.TestDao
import net.kreatec.data.db.model.TestModel

@Database(
    entities = [TestModel::class],
    version = DataConstants.DATABASE_VERSION,
    exportSchema = false
)
internal abstract class AppDatabase : RoomDatabase() {

    abstract fun testDao(): TestDao

}