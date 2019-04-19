package jp.gxp.growthcatserver.front.dao;

import java.util.List;

import jp.gxp.growthcatserver.front.entity.Motion;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.stereotype.Repository;

@ConfigAutowireable
@Dao
@Repository
public interface MotionDao {

    @Select
    List<Motion> selectMotion(String deviceId);

    @Insert(sqlFile = true)
    int insertMotion(String deviceId, Motion motion);
}
