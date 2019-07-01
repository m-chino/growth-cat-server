package jp.gxp.growthcatserver.front.dao.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import jp.gxp.growthcatserver.front.dao.MotionDao;
import jp.gxp.growthcatserver.front.entity.Motion;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MotionDaoImpl implements MotionDao {

    private RestHighLevelClient client;

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    public MotionDaoImpl(RestHighLevelClient client) {
        this.client = client;
    }

    @Override
    public List<Motion> selectMotion(String deviceId) {
        return null;
    }

    @Override
    public int insertMotion(String deviceId, Motion motion) {
        return 0;
    }

    @Override
    public List<Motion> esFetchMotion(String deviceId) {
        System.out.println(client.toString());
        Motion motion = new Motion();
        motion.setAccelerationmeter_x(1.0);
        motion.setAccelerationmeter_y(2.0);
        motion.setAccelerationmeter_z(3.0);
        motion.setGyroscope_x(4.0);
        motion.setGyroscope_y(4.0);
        motion.setGyroscope_z(5.0);
        motion.setMagnetometer_x(6.0);
        motion.setMagnetometer_y(7.0);
        motion.setMagnetometer_z(8.0);
        motion.setLuxometer(0.5);

        List<Motion> list = new ArrayList<>();
        list.add(motion);

        return list;
    }


}
