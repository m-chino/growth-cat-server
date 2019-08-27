package jp.gxp.growthcatserver.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("jp.gxp.growthcatserver")
public class Config {

    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.port}")
    private Integer port;

    @Value("${elasticsearch.http.protocol}")
    private String protocol;

    @Bean
    public RestHighLevelClient returnRestHighLevelClient() {
        System.out.println("elasticsearch host : " + host);
        System.out.println("elasticsearch port : " + port);
        System.out.println("elasticsearch protocol : " + protocol);
        return new RestHighLevelClient(RestClient.builder(new HttpHost(host, port, protocol)));
    }

}
