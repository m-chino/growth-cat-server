package jp.gxp.growthcatserver.front.repository.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jp.gxp.growthcatserver.front.entity.Motion;
import jp.gxp.growthcatserver.front.repository.MotionRepository;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MotionRepositoryImpl implements MotionRepository {
    @Autowired
    public MotionRepositoryImpl(RestHighLevelClient restHighLevelClient) {
        this.restHighLevelClient = restHighLevelClient;
    }

    private RestHighLevelClient restHighLevelClient;

    @Override
    public List<Motion> selectMotion(String deviceId) {

        return null;
    }

    @Override
    public int insertMotion(String deviceId, Motion motion) {
        return 0;
    }

    @Override
    public SearchResponse search(String deviceId) {
        // 検索条件
        SearchRequest searchRequest = new SearchRequest();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.sort(new FieldSortBuilder("registerTimestamp").order(SortOrder.DESC));
        searchSourceBuilder.size(100);
        searchSourceBuilder.query(QueryBuilders.termQuery("deviceId", deviceId));
        searchRequest.source(searchSourceBuilder);

        // リクエスト
        SearchResponse response = null;
        try {
            response = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    public int registMotion(String deviceId, Motion motion) {

        Map<String, Object> requestSource = new HashMap<>();
        requestSource.put("deviceId",deviceId);
        requestSource.put("registerTimestamp",motion.getRegisterTimestamp());
        requestSource.put("accelerationmeter_x",motion.getAccelerationmeter_x());
        requestSource.put("accelerationmeter_y",motion.getAccelerationmeter_y());
        requestSource.put("accelerationmeter_z",motion.getAccelerationmeter_z());
        requestSource.put("gyroscope_x",motion.getGyroscope_x());
        requestSource.put("gyroscope_y",motion.getGyroscope_y());
        requestSource.put("gyroscope_z",motion.getGyroscope_z());
        requestSource.put("magnetometer_x",motion.getMagnetometer_x());
        requestSource.put("magnetometer_y",motion.getMagnetometer_y());
        requestSource.put("magnetometer_z",motion.getMagnetometer_z());
        requestSource.put("luxometer",motion.getLuxometer());
        IndexRequest request = new IndexRequest();
        request.index("motion")
                .opType(DocWriteRequest.OpType.CREATE)
                .source(requestSource)
                .id(UUID.randomUUID().toString());

        try {
            IndexResponse indexResponse = restHighLevelClient.index(request, RequestOptions.DEFAULT);
            System.out.println(indexResponse.status());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println("registMotion");
//        //request.id("1");
//        String jsonString = "{" +
//                "\"deviceId\" : \"" + deviceId + "\"," +
//                "\"registerTimestamp\" : \"" + motion.getRegisterTimestamp() + "\"," +
//                "\"accelerationmeter_x\" : " + motion.getAccelerationmeter_x() + "," +
//                "\"accelerationmeter_y\" : " + motion.getAccelerationmeter_y() + "," +
//                "\"accelerationmeter_z\" : " + motion.getAccelerationmeter_z() + "," +
//                "\"gyroscope_x\" : " + motion.getGyroscope_x() + "," +
//                "\"gyroscope_y\" : " + motion.getGyroscope_y() + "," +
//                "\"gyroscope_z\" : " + motion.getGyroscope_z() + "," +
//                "\"magnetometer_x\" : " + motion.getMagnetometer_x() + "," +
//                "\"magnetometer_y\" : " + motion.getMagnetometer_y() + "," +
//                "\"magnetometer_z\" : " + motion.getMagnetometer_z() + "," +
//                "\"luxometer\" : " + motion.getLuxometer() + "}";
//        System.out.println(jsonString);
        /*try {
            request.source(jsonString, XContentType.JSON);
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/

        return 0;
    }

}
