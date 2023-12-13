package cn.ichensw.linclientsdk;

import cn.ichensw.linclientsdk.client.LinApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Lin API 客户端配置类
 * @author csw
 */
@Data
@Configuration
@ConfigurationProperties("lin.client")
@ComponentScan
public class LinApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 此处方法取名无所谓的，不影响任何地方
     *
     * @return
     */
    @Bean
    public LinApiClient getApiClient() {
        return new LinApiClient(accessKey, secretKey);
    }
}
