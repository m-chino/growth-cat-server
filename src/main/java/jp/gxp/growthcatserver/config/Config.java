package jp.gxp.growthcatserver.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("jp.gxp.growthcatserver")
public class Config {
    @Value("${post}")
    private String post;
    @Value("${port}")
    private Integer port;
    @Value("${protocol}")
    private String protocol;

    @Bean
    public RestHighLevelClient returnRestHighLevelClient(){
        return new RestHighLevelClient(RestClient.builder(new HttpHost(post,port,protocol)));
    }

}
