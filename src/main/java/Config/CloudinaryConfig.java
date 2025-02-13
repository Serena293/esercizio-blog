package Config;

import com.cloudinary.Cloudinary;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {
/*
    @Value("${cloudinary.cloud_name}")
    private String cloudName;
    @Value("${cloudinary.api_key}")
    private String apiKey;
    @Value("${cloudinary.api_secret}")
    private String apiSecret;
*/
    @Bean
    public Cloudinary uploader() {

        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "drfdsipgb"); // Sostituisci con il tuo nome cloud
        config.put("api_key", "455226771167337"); // Sostituisci con la tua API key
        config.put("api_secret", "v4bPTTTWFYT_0oEvYmosLPQVinw"); // Sostituisci con la tua API secret

        return new Cloudinary(config);
    }


}
