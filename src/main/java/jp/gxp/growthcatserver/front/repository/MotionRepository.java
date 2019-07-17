package jp.gxp.growthcatserver.front.repository;

import java.util.List;
import jp.gxp.growthcatserver.front.entity.Motion;
import org.elasticsearch.action.search.SearchResponse;

public interface MotionRepository {

    List<Motion> selectMotion(String deviceId);

    int insertMotion(String deviceId, Motion motion);

    SearchResponse search(String deviceId);

    int registMotion(String deviceId, Motion motion);
}
