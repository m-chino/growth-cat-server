package jp.gxp.growthcatserver.front.dao;

import java.util.List;
import jp.gxp.growthcatserver.front.entity.Motion;

public interface MotionDao {

    List<Motion> selectMotion(String deviceId);

    int insertMotion(String deviceId, Motion motion);

    List<Motion> esFetchMotion(String deviceId);
}
